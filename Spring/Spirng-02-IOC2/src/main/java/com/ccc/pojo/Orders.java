package com.ccc.pojo;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/18 18:01
 */
public class Orders {
    private String o_name;

    public Orders() {
        System.out.println("第一步：执行无参构造创建bean实例");
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
        System.out.println("第二步：调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("第三步：执行初始化的方法");
    }

    //创建执行的销毁的方法
    public void destroyMethod(){
        System.out.println("第五步：执行销毁的方法");
    }
}
