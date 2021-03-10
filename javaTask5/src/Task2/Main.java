package Task2;


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Titanik", new Time(3, 15));
        Movie movie2 = new Movie("Arow", new Time(2, 30));
        Movie movie3 = new Movie("Neo", new Time(1, 50));
        Movie movie4 = new Movie("Rex", new Time(1, 35));
        Movie movie5 = new Movie("Time", new Time(2, 15));
//        System.out.println(movie1);

        Seance seance1 = new Seance(movie1, new Time(17, 35));
        Seance seance2 = new Seance(movie2, new Time(12, 15));
        Seance seance3 = new Seance(movie3, new Time(20, 0));
        Seance seance4 = new Seance(movie4, new Time(11, 30));
        Seance seance5 = new Seance(movie5, new Time(14, 10));
//        System.out.println(seance1);

        Schedule schedule1 = new Schedule(new TreeSet<>(Arrays.asList(seance3, seance2, seance5)));
        Schedule schedule2 = new Schedule(new TreeSet<>(Arrays.asList(seance1, seance4, seance3)));
        Schedule schedule3 = new Schedule(new TreeSet<>(Arrays.asList(seance2, seance5, seance1)));
        Schedule schedule4 = new Schedule(new TreeSet<>(Arrays.asList(seance3, seance1, seance5)));
        Schedule schedule5 = new Schedule(new TreeSet<>(Arrays.asList(seance1, seance2, seance3)));
        System.out.println(schedule1);


        Time timeOpen = new Time(11, 0);
        Time timeClose = new Time(22, 59);

        TreeMap<Days, Schedule> cinema = new TreeMap<>();

        cinema.put(Days.MONDAY, schedule1);
        cinema.put(Days.TUESDAY, schedule2);
        cinema.put(Days.WEDNESDAY, schedule3);
        cinema.put(Days.THURSDAY, schedule4);
        cinema.put(Days.FRIDAY, schedule5);
        cinema.put(Days.SATURDAY, schedule3);
        cinema.put(Days.SUNDAY, schedule2);

        Cinema cinemaFull = new Cinema(cinema, timeOpen, timeClose);
        System.out.println(cinemaFull);


        cinemaFull.addSeance(seance1, Days.MONDAY);
        System.out.println(cinemaFull);

        cinemaFull.addSeances(Days.FRIDAY, seance1, seance2, seance3, seance4, seance5);
        System.out.println(cinemaFull);

        cinemaFull.removeMovie("Arow");
        System.out.println(cinemaFull);

        cinemaFull.removeSeance(seance5, Days.MONDAY);
        System.out.println(cinemaFull);
    }
}
