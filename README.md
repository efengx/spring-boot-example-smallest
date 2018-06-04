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
- branch
```text
git branch dev
git checkout -b dev
git commit -a -m 'code commit'
git push
```

- ssk
```text
ssh-keygen -t rsa
```
