package Task2;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Titanik", new Time(3, 15));
        Movie movie2 = new Movie("Arow", new Time(2, 30));
        Movie movie3 = new Movie("Neo", new Time(1, 50));


        Seance seance1 = new Seance(movie1, new Time(17, 35));
        Seance seance2 = new Seance(movie2, new Time(12, 15));
        Seance seance3 = new Seance(movie3, new Time(20, 0));


        Schedule daySeance = new Schedule();
        daySeance.addSeance(movie1, new Time(20, 35));
        daySeance.addSeance(movie3, new Time(12, 15));
        daySeance.addSeance(movie2, new Time(18, 10));

        System.out.println(daySeance);
        Time timeOpen = new Time(9, 0);
        Time timeClose = new Time(23, 59);
        Cinema cinema = new Cinema();
        cinema.addSeances(daySeance, Days.MONDAY, seance3);
 System.out.println(cinema);

    }
}
