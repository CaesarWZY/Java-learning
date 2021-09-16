package chapter02;

public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random()*10);
        System.out.println(" u know what i'm thinking "+number);
    }
    
    
}
