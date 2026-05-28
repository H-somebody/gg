package com.ooptest3;

public class Teacher {
    //属性
    String name;
    int age;
    //行为
    //能干什么，方法的形式体现（不加static）
    public void teach(){
        System.out.println("老师在上课");
    }
    public void eat(){
        System.out.println("老师在吃饭");
    }
    public void sleep(){
        System.out.println("老师在睡觉");
    }
}
