package com.ccc.pojo;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/27 1:44
 */
public class User {
    private int id;
    private String username;
    private String money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public User(int id, String username, String money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    public User() {
    }
}
