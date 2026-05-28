package com.ooptest3;

public class Test {
    public static void main(String[] args) {
        //创建老师这个对象
        Teacher t = new Teacher();
        t.name="阿伟";
        t.age=18;
        //获取信息并打印
        System.out.println(t.name);
        System.out.println(t.age);
        //调用行为方法
        t.teach();
        t.eat();
        t.sleep();
    }
}
