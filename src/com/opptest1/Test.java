package com.opptest1;

public class Test {
    public static void main(String[] args) {
        //创建对象记录小狗信息
        Dog d1 = new Dog();
        d1.name = "小白";
        d1.age = 2;
        d1.weight = 3.5;
        d1.color = "白色";
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);
    }
}
