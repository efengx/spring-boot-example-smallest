package com.spring.boot.example.smallest.Server;

import com.spring.boot.example.smallest.Entity.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring.boot.example.smallest.Dao.UserDao;
@Service
public class UserServerImpl implements UserServer{
    @Autowired
    private UserDao userDao;

    public void save(UserEntity userEntity){
        userDao.save(userEntity);
    }

}
