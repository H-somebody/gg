package comSecond.oopextendsTest1;
//用extends关键字继承Person父类属性和方法
public class Student extends Person {
    //只写子类特有的内容
    int grade;
    public void study(){
        System.out.println("学生在学习");
    }
}
