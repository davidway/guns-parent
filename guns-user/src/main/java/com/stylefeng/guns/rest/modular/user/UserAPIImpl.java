package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;



@Component
@Service(interfaceClass = UserAPI.class)
public class UserAPIImpl {
}
