package com.blog.util;

/**
 * Created by 覃玉初 on 2017/8/7.
 */
public class Interception {

    public String interceptionPath(String path, String interceptionFileName) {

        boolean flag = false;
        String returnPath="\\";
        String[] pathArray = path.split("\\\\");
        for (int i = 0; i < pathArray.length; i++) {

            if (pathArray[i].equals(interceptionFileName)) {

                flag = true;
            }

            if (flag) {

                returnPath = returnPath + pathArray[i] + "/";
            }
        }

        return returnPath;
    }
}
