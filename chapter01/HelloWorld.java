package chapter01;
public class HelloWorld {
    public static void main(String[] args) throws Exception{
        System.out.println("HelloWorld");
        String msg = "Hello";
        int len = 5;
        //method test 
        for (int i = 0; i < len; i++) {
            bark(msg);
        }
    }
    //method test
    public static void bark(String msg){
        System.out.println(msg);
    }
}
