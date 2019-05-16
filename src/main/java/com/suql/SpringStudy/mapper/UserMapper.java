package com.suql.SpringStudy.mapper;

import com.suql.SpringStudy.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select u_name as name from xy_userinfo where u_phone = #{phone}")
    List<UserInfo> findUserByPhone(String phone);
}
