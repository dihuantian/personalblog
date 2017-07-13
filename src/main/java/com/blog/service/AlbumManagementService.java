package com.blog.service;

import com.blog.entity.Image;
import com.blog.entity.UserAlbum;

import java.util.List;

/**
 * Created by 覃玉初 on 2017/6/27.
 */
public interface AlbumManagementService {

    boolean createAlbum(UserAlbum userAlbum,String albumPath);

    List<UserAlbum> getAllAlbum();

    boolean deleteAlbum(UserAlbum userAlbum,String albumPath);

    boolean alterAlbum(int userAlbumId,String newName);

    List<Image> getAllImage(int albumId);

    boolean uploadImage(Image image);

}
