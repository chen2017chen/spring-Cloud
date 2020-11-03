package com.ccc.aop;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 15:47
 */
public class BookProxy {

    public void before(){
        System.out.println("before.........");
    }

    public void after(){
        System.out.println("after..........");
    }
}
