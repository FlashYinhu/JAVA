package com.kyh.standard.Object;

public class StandardJavaBean {
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    // 空参
    public StandardJavaBean(){}
    // 全参
    public StandardJavaBean(String username, String password, String email, String gender, int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    // get set 方法
    // 快捷键 alt + insert
    // PTG 1秒生成标准JavaBean

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }


    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getGender(){
        return this.gender;
    }
    public String getEmail(){
        return this.email;
    }
    public int gerAge(){
        return this.age;
    }
}
