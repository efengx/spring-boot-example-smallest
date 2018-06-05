package com.spring.boot.example.smallest.Repository;

import com.spring.boot.example.smallest.Entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
