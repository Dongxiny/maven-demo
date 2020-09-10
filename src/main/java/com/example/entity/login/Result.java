package com.example.entity.login;

import com.example.entity.user.User;

/**
 * @author ：d
 * @description：TODO
 * @date ：2020/9/10 14:13
 */
public class Result {
    private String type;
    private String message;
    private User user;

    public Result(String type, String message, User user) {
        this.type = type;
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
