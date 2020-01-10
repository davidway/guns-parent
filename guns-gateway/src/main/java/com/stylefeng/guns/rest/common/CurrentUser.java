package com.stylefeng.guns.rest.common;

import com.stylefeng.guns.api.user.model.UserInfoModel;

public class CurrentUser {
    //线程绑定的存储空间
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public static void  saveUserInfo(String userId){
        threadLocal.set(userId);
    }
  /*  public static void  saveUserInfo(UserInfoModel userInfoModel){
        threadLocal.set(userInfoModel);
    }*/

    public static String getCurrentUser(){
        return threadLocal.get();
    }
}