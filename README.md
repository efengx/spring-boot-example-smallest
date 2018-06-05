# README.md #

### Description ###
Spring boot minimal project
Spring boot best practice


* Use the simplest structure

### Config ###


### File structure ###
```text
|-- src
|-- main
|-- |-- com.spring.boot.example.{projectName}
|-- |-- |-- {projectName}Application.java
|-- |-- |-- config
|-- |-- |-- entity
|-- |-- |-- repository
|-- |-- |-- controller
|-- test
```


### rest api
```text
GET
POST
PUT
PATCH
DELETE
```


1, Maven 
pom.xml

2, Spring MVC (*)
RestController RequestMapping GetMapping PostMapping

3, JSON (*)

5, hibernate (*)
ORM
CREATE DATABASE IF NOT EXISTS demo default charset utf8 COLLATE utf8_general_ci
ddl-auto

4, Spring data jpa (*)

6, mysql (*)


### git
```text
git clone https://github.com/efengx/spring-boot-example-smallest.git

git add .
git commit -m 'code commit'
git push
```

###entity
|——user
|——menu
|——role
user表和menu表是多对多的关系，表明一个人可以操作多个不同角色的菜单，一个菜单也可以给不同的人操作
user表和role表是一对多的关系，表明一个人可以有多个角色
不同角色有不同的操作菜单

###manytomany
既然是多对多的关系，那么应该主控方被控方的注释相同。