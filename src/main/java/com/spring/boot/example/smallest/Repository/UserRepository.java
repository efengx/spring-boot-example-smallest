package com.spring.boot.example.smallest.Repository;

import com.spring.boot.example.smallest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
}
