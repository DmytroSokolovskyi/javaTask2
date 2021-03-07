package Task2;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Титанк", new Time(2, 30));
        System.out.println(movie);

        Seance seance = new Seance(movie, new Time(20, 35));

        System.out.println(seance);


    }
}
