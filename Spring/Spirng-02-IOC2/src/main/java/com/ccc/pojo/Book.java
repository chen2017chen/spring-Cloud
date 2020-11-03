package com.ccc.pojo;

import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/18 13:42
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
