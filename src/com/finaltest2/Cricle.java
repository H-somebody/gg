package com.finaltest2;

public class Cricle {
    private double radii;
    //用final修饰PI固定Π的值
    private final double PI = 3.14;

    //空参构造
    public Cricle() {
    }
    //全参构造
    public Cricle(double radii) {
        this.radii = radii;
    }


    //输出半径
    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }
    //输出PI
    public double getPI() {
        return PI;
    }


    //构造成员方法计算面积
    public double getArea() {
        return PI * radii * radii;
    }
    //构造成员方法计算周长
    public double getLength() {
        return PI * 2 * radii;
    }


}
