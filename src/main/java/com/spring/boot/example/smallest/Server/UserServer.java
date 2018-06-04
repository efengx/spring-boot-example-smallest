package com.spring.boot.example.smallest.Server;

import com.spring.boot.example.smallest.Entity.UserEntity;

public interface UserServer {
    public void save(UserEntity user);
}
