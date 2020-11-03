package com.ccc.pojo;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 16:46
 */
public class Book {
    private int id;
    private String username;
    private String ustatus;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public Book(int id, String username, String ustatus) {
        this.id = id;
        this.username = username;
        this.ustatus = ustatus;
    }

    public Book() {
    }
}
