package com.spring.boot.example.smallest.Repository;

import com.spring.boot.example.smallest.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
