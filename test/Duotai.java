package test;

public class Duotai {
    public static void main(String[] args){
        
        //创建的依旧是一个父类对象但是如果子类中对父类中的方法进行重写，
        //则使用的父类方法的实际功能为子类方法,s属性也是使用的子类中更改的
        Father father_test = new Children();
        //father_test.eat();
        //father_test.func1();
        /*
        boolean result1 = father_test instanceof Children;
        boolean result2 = father_test instanceof Father;
        System.out.println(result1);
        System.out.println(result2);
        */
        father_test.func1();
        father_test.getInfo();
        


        int i = 15,j = 10;
        System.out.println();
        Children children = new Children();
        children.func3(i,j);
        children.func1(i);
        children.func4();

    }
}
