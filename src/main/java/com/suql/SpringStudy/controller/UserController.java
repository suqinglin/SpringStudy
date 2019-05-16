package com.suql.SpringStudy.controller;

import com.alibaba.fastjson.JSONObject;
import com.suql.SpringStudy.pojo.UserInfo;
import com.suql.SpringStudy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @PostMapping("/listUser")
    public String listUser(@RequestBody JSONObject jsonObject) {
        String phone = jsonObject.getString("phone");
        List<UserInfo> userInfos =  userMapper.findUserByPhone(phone);
        String name = null;
        for (int i = 0; i < userInfos.size(); i++) {
            UserInfo userInfo = userInfos.get(i);
            name = userInfo.getName();

        }
        return name;
    }
}
