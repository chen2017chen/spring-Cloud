package com.ccc.pojo;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/16 18:51
 */
//部门类
public class Dept {
    private String d_name;

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "d_name='" + d_name + '\'' +
                '}';
    }
}
