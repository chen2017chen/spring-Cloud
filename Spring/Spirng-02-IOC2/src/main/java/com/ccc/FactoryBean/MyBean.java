package com.ccc.FactoryBean;

import com.ccc.pojo.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/18 14:33
 */
public class MyBean implements FactoryBean<Course> {

    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("abc");
        return course;
    }

    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
    }
}
