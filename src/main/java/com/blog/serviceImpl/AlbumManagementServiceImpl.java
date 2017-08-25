package com.blog.serviceImpl;

import com.blog.dao.ImageMapper;
import com.blog.dao.UserAlbumMapper;
import com.blog.entity.Image;
import com.blog.entity.UserAlbum;
import com.blog.service.AlbumManagementService;
import com.blog.util.Interception;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/27.
 */
@Service
public class AlbumManagementServiceImpl implements AlbumManagementService {

    @Resource
    private UserAlbumMapper userAlbumMapper;

    @Resource
    private AlbumManagementService albumManagementService;

    @Resource
    private ImageMapper imageMapper;

    /*
    * 创建博主相册，涉及相册名称，相册容量
    * */
    @Transactional
    public boolean createAlbum(UserAlbum userAlbum, String albumPath) {
        /*//转储路径
        String storagePath = System.getProperty("user.dir").replace("bin", "UploadFile\\Images");
        *//*获取webapp路,并在编译路径创建文件相册*/

        File createNewAlbum = new File(albumPath + "/" + userAlbum.getAlbumname());
        if (!createNewAlbum.exists()) {

            createNewAlbum.mkdirs();
            userAlbumMapper.insert(userAlbum);
            return true;
        } else {

            return false;
        }
    }
/*
    *//*
    * 创建转储文件相册
    * *//*
    public boolean storageAlbum(String filePath, UserAlbum userAlbum) {

        File file = new File(filePath + userAlbum.getAlbumname());
        if (!file.exists()) {

            file.mkdirs();
            return true;
        } else {

            return false;
        }
    }*/

    /*
    * 获取所有相册
    * */
    public List<UserAlbum> getAllAlbum() {

        List<UserAlbum> userAlbumList = userAlbumMapper.selectByAll();
        if (userAlbumList != null) {
            return userAlbumList;
        } else {
            return null;
        }
    }

    /*
    * 根据相册id 删除指定相册文件夹和数据库数据
    * */
    public boolean deleteAlbum(UserAlbum userAlbum, String albumPath) {

        /*获取webapp路径*/
        File deleteAlbum = new File(albumPath + "\\src\\main\\webapp\\staticResources\\album\\" + userAlbum.getAlbumname());
        if (deleteAlbum.exists()) {
            deleteAlbum.delete();
            userAlbumMapper.deleteByPrimaryKey(userAlbum.getAlbumid());
            return true;
        } else {
            return false;
        }
    }

    /*
    * 修改相册的名字
    * */
    public boolean alterAlbum(int userAlbumId, String newName) {
        String albumPath = System.getProperty("user.dir");
        String albumName = userAlbumMapper.selectByPrimaryKey(userAlbumId).getAlbumname();
        File alterAlbum = new File(albumPath + "\\src\\main\\webapp\\staticResources\\album\\" + albumName);
        if (alterAlbum.exists()) {
            File alterAlbumNewName = new File(albumPath + "\\src\\main\\webapp\\staticResources\\album\\" + newName);
            if (alterAlbum.renameTo(alterAlbumNewName)) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    /*
    * 取出指定相册中的所有图片
    * */
    public List<Image> getAllImage(int albumId) {
        List<Image> imageList = imageMapper.selectByPrimaryKeyAllImage(albumId);
        if (imageList != null) {
            return imageList;
        } else {
            return null;
        }
    }

    /*根据相册名字获取相册*/
    public UserAlbum getSingAlbum(String albumName) {

        return userAlbumMapper.selectByName(albumName);
    }


    /*
    * 上传图片
    * */
    public boolean uploadImage(MultipartFile[] files, String albumName) {

        String path = this.getClass().getClassLoader().getResource("/").getPath();
        //截取路径到WEB-INF
        path = path.replace("WEB-INF/classes", "tempUpload/Images");
        if (files != null && files.length > 0) {

            File saveFolder = new File(path + "/" + albumName + "/");
            if (!saveFolder.exists()) {

                saveFolder.mkdirs();
            }

            UserAlbum userAlbum = albumManagementService.getSingAlbum(albumName);

            for (int i = 0; i < files.length; i++) {

                MultipartFile multipartFile = files[i];
                try {

                    if (multipartFile != null) {

                        String savePath = saveFolder.getPath() + "\\" + multipartFile.getOriginalFilename();
                        File saveFile = new File(savePath);
                        multipartFile.transferTo(saveFile);
                        imageMapper.insert(this.packageImage(userAlbum,saveFile));
                    } else {

                        continue;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }


    Interception interception=new Interception();
    private Image packageImage(UserAlbum userAlbum, File file) {

        Image image=new Image();
        image.setAlbumid(userAlbum.getAlbumid());
        image.setAmagepaht(interception.interceptionPath(file.getPath(),"tempUpload"));
        return image;
    }

}
