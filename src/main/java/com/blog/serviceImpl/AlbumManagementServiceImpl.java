package com.blog.serviceImpl;

import com.blog.dao.ImageMapper;
import com.blog.dao.UserAlbumMapper;
import com.blog.entity.Image;
import com.blog.entity.UserAlbum;
import com.blog.service.AlbumManagementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/27.
 */
@Service
public class AlbumManagementServiceImpl implements AlbumManagementService {

    @Resource
    private UserAlbumMapper userAlbumMapper;

    @Resource
    private  ImageMapper imageMapper;

    /*
    * 创建博主相册，涉及相册名称，相册容量
    * */
    public boolean createAlbum(UserAlbum userAlbum,String albumPath) {

        /*获取webapp路径*/
        File createNewAlbum=new File(albumPath+"\\src\\main\\webapp\\staticResources\\album\\"+userAlbum.getAlbumname());
        if(createNewAlbum.exists()){
            return false;
        }else{
            createNewAlbum.mkdir();
            userAlbumMapper.insert(userAlbum);
        }
        return true;
    }

    /*
    * 获取所有相册
    * */
    public List<UserAlbum> getAllAlbum(){

        List<UserAlbum> userAlbumList=userAlbumMapper.selectByAll();
        if(userAlbumList!=null){
            return userAlbumList;
        }else{
            return null;
        }
    }

    /*
    * 根据相册id删除指定相册文件夹和数据库数据
    * */
    public boolean deleteAlbum(UserAlbum userAlbum,String albumPath){

        /*获取webapp路径*/
        File deleteAlbum=new File(albumPath+"\\src\\main\\webapp\\staticResources\\album\\"+userAlbum.getAlbumname());
        if(deleteAlbum.exists()){
            deleteAlbum.delete();
            userAlbumMapper.deleteByPrimaryKey(userAlbum.getAlbumid());
            return true;
        }else{
            return false;
        }
    }

    /*
    * 修改相册的名字
    * */
    public boolean alterAlbum(int userAlbumId,String newName){
        String albumPath = System.getProperty("user.dir");
        String albumName=userAlbumMapper.selectByPrimaryKey(userAlbumId).getAlbumname();
        File alterAlbum=new File(albumPath+"\\src\\main\\webapp\\staticResources\\album\\"+albumName);
        if(alterAlbum.exists()){
            File alterAlbumNewName=new File(albumPath+"\\src\\main\\webapp\\staticResources\\album\\"+newName);
            if(alterAlbum.renameTo(alterAlbumNewName)){
                return true;
            }
            return false;
        }else{
            return false;
        }
    }

    /*
    * 取出指定相册中的所有图片
    * */
    public List<Image> getAllImage(int albumId){
        List<Image> imageList=imageMapper.selectByPrimaryKeyAllImage(albumId);
        if(imageList!=null){
            return imageList;
        }else{
            return null;
        }
    }

    /*
    * 上传图片
    * */
    public boolean uploadImage(Image image){


        return false;
    }
}
