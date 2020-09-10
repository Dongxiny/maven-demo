package com.example.dao.user;

import com.example.entity.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author ：d
 * @description：TODO
 * @date ：2020/8/31 16:59
 */
@Mapper
public interface UserDao {
    @Results(id = "User", value = {
            @Result(property ="username",column = "user_name"),
            @Result(property = "password", column = "user_password")
    })
    @Select("select user_name,user_password from service_system_user where user_name = #{username}")
    User selectUser(@Param("username") String username);
}
