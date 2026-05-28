package com.enumtest1;
//枚举，要把普通JavaBean类的class改为enum
public enum OrderState {
    //在枚举类的第一行，罗列所有的对象
    /*中文状态	英文常量名
        待支付	PAYMENT_PENDING
        处理中	PROCESSING
        已发货	SHIPPED
        配送中	OUT_FOR_DELIVERY
        已送达	DELIVERED
        已取消	CANCELLED*/

    //枚举项的底层其实就是常量，默认由public static final修饰
    PAYMENT_PENDING("待支付"),PROCESSING("处理中"),SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),DELIVERED("已送达"),CANCELLED("已取消");
    private String name;

    //删去空参构造
    /*public OrderState() {
    }*/


    //把带全参构造public改为私有private
    //构造方法必须是private修饰，目的是不让外界创建本类的对象
    //枚举类的构造方法默认使用private，就算不写，虚拟机也会默认
    private OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //此时所有的对象已经创建完毕，而且已经存入数据，因此不需要setName
    /*public void setName(String name) {
        this.name = name;
    }*/
}
