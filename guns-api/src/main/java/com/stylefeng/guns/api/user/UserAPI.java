package com.stylefeng.guns.api.user;


import com.stylefeng.guns.api.user.model.UserInfoModel;
import com.stylefeng.guns.api.user.model.UserModel;

public interface UserAPI {
    int login(String username,String password);

    boolean registr(UserModel userModel);

    boolean checkName(String username);

    UserInfoModel getUserInfo(int uuid);

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);
}
