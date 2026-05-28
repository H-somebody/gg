package comSecond.oopextendsTest1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        //Student类中没定义age，但是在父类Person中定义了，可以直接在子类student中访问
        s.age = 14;


    }
}
