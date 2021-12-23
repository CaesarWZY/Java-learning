package test;

public class Father {

    private int id = 1;
    private String name = " 父类创建属性测试id " + this.id +" ";
    int age = 0;


    public void getInfo(){
        this.age = 10;
        System.out.println(this.id+this.name+this.age);
    }

    public Father(){
        System.out.println("父类对象创建被执行了"+this);
    }
    
    public void eat(){
        System.out.println("爸爸吃饭！！！");
    }

    public void yell(){
        System.out.println("爸爸喊人了！！！");
    }


    public void func1(){
        func2();
    }

    public void func2(){
        System.out.println("父类中使用的测试函数");
    }
    public void func4(){
        System.out.println("继承成功");
    }


}
class Children extends Father{
    protected int id = 2;
    protected String name = "子类创建属性测试id "+this.id;
    
    public void func1(int i ){
        System.out.printf("输入的数字为：%d%n",i);
    }
    
    @Override
    public void func2(){
        System.out.println("子类中使用的测试函数");
        System.out.println(this.name);
    }
    protected void func3(int i,int j){
        System.out.println(max(i, j));
        
    }

    private String max(int i, int j){
        int max_num = i;
        if(i < j) max_num = j;
        return("两个数中大的数是"+max_num);
    }


    //类似于一个声明函数
    protected  Children(){
        System.out.println("子类保护对象创建被执行了！"+this);
    }


    @Override
    public void eat(){
        System.out.println("现在应该是儿子吃饭了才对");
    }



}