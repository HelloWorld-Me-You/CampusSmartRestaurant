package com.smart.restaurant.service;

import com.smart.restaurant.dto.UserLoginDTO;
import com.smart.restaurant.entity.User;

public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
