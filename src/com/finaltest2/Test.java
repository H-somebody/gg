package com.finaltest2;

public class Test {
    public static void main(String[] args) {
        /*定义一个JavaBean类描述园
        属性：半径和圆周率
        行为：计算圆的面积和周长        */

        Cricle cr = new Cricle(2.5);
        System.out.println(cr.getRadii());
        System.out.println(cr.getPI());
        System.out.println(cr.getArea());
        System.out.println(cr.getLength());
    }
}
