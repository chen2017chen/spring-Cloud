package com.ccc.service;

import com.ccc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/27 0:15
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;
}
