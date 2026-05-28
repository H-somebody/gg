package com.finaltest1;

public class finalTest {
    public static void main(String[] args) {

        /*final修饰变量，此时叫做常量
        特点：1.只能赋值一次，一旦赋值不能改变
             2.常量名大写，多个单词用下划线隔开


        细节：
            基本数据类型：
                byte  short  int  long  float  double  char  boolean
                变量里面记录的是真实的数据
                final int a = 10;   此时变量里面记录的数据无法改变


            引用数据类型：
                除了上面四类八种，其他所有的数据类型都是引用类型
                int[] Student Teacher ...
                stu里面记录的是对象的内存地址，不可改变的是stu记录的内存地址
                而对象里面的属性值，是可以发生改变
                final Student stu = new Student();

            综上所述：
                final修饰哪个变量，这个变量里面记录的内容就无法再次发生改变

             */

        final int NUMBER = 100;

    }
}
