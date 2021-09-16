package chapter02;


class Movie{
    String title,genre;
    int rating;

    void playIt(){
        System.out.println("Playing the movie "+title);
    }

}


public class MovieTestDriver {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Batman";
        one.genre = "Comic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "j8 chnlyc";
        two.genre = "j8";
        two.rating = 5;
        two.playIt();

    }
}
