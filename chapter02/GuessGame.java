package chapter02;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame() {
         p1 = new Player();
         p2 = new Player();
         p3 = new Player();
        
         int guess1 = 0;
         int guess2 = 0;
         int guess3 = 0;

         boolean p1isright = false;
         boolean p2isright = false;
         boolean p3isright = false;

         int target_num = (int) (Math.random()* 10);
         System.out.println("Ur dad is thinking a number between 0-9...");
         
         while(true){
             System.out.println("Number to be guess is "+ target_num);

             p1.guess();
             p2.guess();
             p3.guess();

             guess1 = p1.number;
             System.out.println("有请一号受害者"+guess1);
             guess2 = p2.number;
             System.out.println("有请2号受害者"+guess2);
             guess3 = p3.number;
             System.out.println("有请3号受害者"+guess3);

             if(guess1 == target_num){
                 p1isright = true;
             }
             if(guess2 == target_num){
                p2isright = true;
            }
            if(guess3 == target_num){
                p3isright = true;
            }

            if(p1isright || p2isright || p3isright){

                System.out.println("Got a winner");
                System.out.println("1"+p1isright);
                System.out.println("2"+p2isright);
                System.out.println("3"+p3isright);
                break;
            }else{
                System.out.println("失败了总是会再来一次的");
            }
         }
    }
}
