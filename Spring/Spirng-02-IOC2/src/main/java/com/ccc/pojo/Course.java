package com.ccc.pojo;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/18 13:30
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
