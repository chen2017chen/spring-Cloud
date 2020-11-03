package com.ccc.pojo;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 22:42
 */
public class User {

    private int user_id;
    private String user_name;
    private String user_status;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public User(int user_id, String user_name, String user_status) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_status = user_status;
    }

    public User() {
    }
}
