package com.ccc.autowired;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/18 22:57
 */
public class Employee {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
