package com.ccc.pojo;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/16 18:50
 */
//员工类
public class Employee {
    private String e_name;
    private String gender;
    private Dept dept;
    //生成dept的get方法
    public Dept getDept() {
        return dept;
    }
    public Employee(String e_name, String gender, Dept dept) {
        this.e_name = e_name;
        this.gender = gender;
        this.dept = dept;
    }

    public Employee() {
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void print(){
        System.out.println(e_name+"::"+gender+"::"+dept);
    }



}
