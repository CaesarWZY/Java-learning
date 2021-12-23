package chapter01;

import jdk.jfr.Description;

@Description(value="java注解")
public class Loop {
    public static void main(String[] args) {

        int boundry = 5;//边界点
        System.out.println("This is while loop!");
        while_loop(boundry);
        System.out.println("This is do while loop!");
        do_whileloop();
        System.out.println("This is for loop!");  
        for_loop(boundry);

        int rand1 = (int)(Math.random()*boundry);//生成随机数
        System.out.print("random number is:");
        System.out.println(rand1);

    }
    public static void while_loop(int x){
        while (x>0){
            x = x-1;
            System.out.println(x);
        }
            
    }

    public static void do_whileloop(){

    }

    public static void for_loop(int x){
        for ( int i = 0; i < x; i++ ) {
            System.out.println(x);
        }
    }
    
}
