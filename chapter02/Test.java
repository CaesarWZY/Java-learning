package chapter02;

public class Test {
    //全局变量定义
    int id ;  
    public static String test_string = "lyc zhen de j8";//定义全局变量
    private int age = 10;

    int data[] = null;

    public void setInfo(){
        this.data = new int[]{this.id,this.age};
        
    }
    //纯纯的测试函数
    static void test(String a) {
        System.out.println(a);
    }



    public static void Print_method_test(String a) {
        System.out.println(a);
    }


    public void  Set_id(int id_info) {
        this.id = id_info;
    }

    public int getInfo(){
        
        return this.id ;
        
    }

    public static void main(String[] args){
        String a = "lyc 真的是个臭傻逼!";
        Print_method_test(a);
        test(test_string);
        Test test1 = new Test();
        System.out.println(test1.id);
        test1.Set_id(15); 
        int data[] = {1,2,3};
        //System.out.printf("%d %d \n",test1.getInfo());

        System.out.println("傻逼测试");
        // for (int i = 0; i <data.length; i++){
        //     System.out.println(data[i]);
        // }
        
        for(int i :data)
            System.out.println(i);
    }
}
