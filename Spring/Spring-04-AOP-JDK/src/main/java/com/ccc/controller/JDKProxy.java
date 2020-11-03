package com.ccc.controller;

import com.ccc.dao.UserDao;
import com.ccc.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/25 21:48
 */
public class JDKProxy  {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces={UserDao.class};
        UserDaoImpl userDao=new UserDaoImpl();
        UserDao dao=(UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result:"+result);
        String id=dao.update("我是ccc");
        System.out.println("id:"+id);
    }
}
    //创建代理对象代码
  class UserDaoProxy implements InvocationHandler{
    //创建xxx的代理对象，把xxx传递过来
        //有参构造传递
    private Object object;
    public UserDaoProxy(Object object){
        this.object=object;
    }

    //方法中增强的逻辑
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行...."+method.getName()+" :传递的参数..."+ Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(object, args);
        //方法之后
        System.out.println("方法之后执行...."+object);
        return res;
    }
}