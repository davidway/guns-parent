package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserAPI;
import com.stylefeng.guns.api.user.model.UserInfoModel;
import com.stylefeng.guns.api.user.model.UserModel;
import org.springframework.stereotype.Component;



@Component
@Service(interfaceClass = UserAPI.class)
public class UserAPIImpl implements UserAPI {

    @Override
    public int login(String username, String password) {
        System.out.println(""+username+","+password);
        return 3;
    }

    @Override
    public boolean registr(UserModel userModel) {
        return false;
    }

    @Override
    public boolean checkName(String username) {
        return false;
    }

    @Override
    public UserInfoModel getUserInfo(int uuid) {
        return null;
    }

    @Override
    public UserInfoModel updateUserInfo(UserInfoModel userInfoModel) {
        return null;
    }
}
