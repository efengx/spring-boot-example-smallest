package com.spring.boot.example.smallest.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int u_id;

    private String name;

    private int age;

    @ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "r_id")
    private Role role;

    @ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinTable(name = "Menu_User",
            joinColumns = {@JoinColumn(name = "userId", referencedColumnName = "u_id")},
            inverseJoinColumns = {@JoinColumn(name = "menuId", referencedColumnName ="m_id")})
    private Set<Menu> menu;


    public Set<Menu> getMenu() {
        return menu;
    }

    public void setMenu(Set<Menu> menu) {
        this.menu = menu;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getU_id() {
        return u_id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
