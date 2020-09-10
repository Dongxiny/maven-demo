package com.example.controller.user;

import com.example.dao.user.UserDao;
import com.example.entity.login.Result;
import com.example.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

/**
 * @ author ：d
 * @ description:
 * @ date ：2020/8/31 15:01
 */
@Controller
public class UserController {

    @Autowired
    UserDao userDao;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result Login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
//        对html标签进行转义，防止XSS攻击
        username = HtmlUtils.htmlEscape(username);

        user = userDao.selectUser(username);

        if(user == null){
            return new Result("warning", "用户不存在", null);
        }else if (!password.equals(user.getPassword())){
            return new Result("warning", "用户密码错误", null);
        }else if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
            return new Result("success", "登录成功", user);
        }else {
            return new Result("warning", "请重新输入", null);
        }
    }

}
