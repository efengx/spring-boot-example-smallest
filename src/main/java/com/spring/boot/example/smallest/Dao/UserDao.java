package com.spring.boot.example.smallest.Dao;

import com.spring.boot.example.smallest.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity, Long>{
}
