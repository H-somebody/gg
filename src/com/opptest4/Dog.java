package com.opptest4;

public class Dog {
    private String name;
    private int age;
    //     get/set

    //name
    //value：代表将来要赋的值
    public void setName(String value) {
        // 给对象中的属性进行赋值
        name = value;
    }

    public String getName() {
        return name;
    }

    //age
    //num:代表将来要赋的值
    public void setage(int num) {
        if (num >= 0 && num <= 15) {
            age = num;
        } else {
            System.out.println("输入的数据有误");
        }
    }

    public int getAge() {
        return age;
    }

    //吃骨头的方法
    public void eat() {
        System.out.println(age + "岁的" + name + "，正在吃骨头");
    }
}
