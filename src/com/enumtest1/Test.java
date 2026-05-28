package com.enumtest1;

public class Test {

    public static void main(String[] args) {
        /*中文状态	英文常量名
        待支付	PAYMENT_PENDING
        处理中	PROCESSING
        已发货	SHIPPED
        配送中	OUT_FOR_DELIVERY
        已送达	DELIVERED
        已取消	CANCELLED*/

        //因为在枚举中已经创建，可直接用类名调用
        OrderState o1 = OrderState.PAYMENT_PENDING;
        System.out.println(o1);    //PAYMENT_PENDING
        // 因为调用的是枚举默认的 toString() 方法，它会直接返回枚举常量的名称

        System.out.println(o1.getName());  //待支付


        //这时可用switch来匹配每个对象
        switch (o1){
            case PAYMENT_PENDING:
                System.out.println("待支付状态");
                break;
            case PROCESSING:
                System.out.println("处理中状态");
                break;
        }
    }
}
