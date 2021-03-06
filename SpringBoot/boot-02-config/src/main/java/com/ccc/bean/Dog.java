package com.ccc.bean;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/23 12:35
 */
public class Dog {
    public String name;
    public Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
