package com.spring.boot.example.smallest.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int m_id;

    private String title;

    private String parestMenu;

   @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
   @JoinTable(name = "Menu_User",
           joinColumns = {@JoinColumn(name = "menuId", referencedColumnName = "m_id")},
           inverseJoinColumns = {@JoinColumn(name = "userId", referencedColumnName ="u_id")})
    private Set<User> users;


    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public int getId() {
        return m_id;
    }

    public void setId(int m_id) {
        this.m_id = m_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParestMenu() {
        return parestMenu;
    }

    public void setParestMenu(String parestMenu) {
        this.parestMenu = parestMenu;
    }
}
