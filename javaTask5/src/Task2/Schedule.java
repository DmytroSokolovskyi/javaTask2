package Task2;

import lombok.*;

import java.util.Set;
import java.util.TreeSet;

@Getter
@Setter
@EqualsAndHashCode
public class Schedule {

    private Set<Seance> setSeans;


    public Schedule(TreeSet<Seance> seances) {
        this.setSeans = seances;
    }

    public Seance addSeance(Movie movie, Time startTime) {
        setSeans.add(new Seance(movie, startTime));
        return new Seance(movie, startTime);
    }

    public Seance addSeance( Seance seance) {
         setSeans.add(seance);
        return seance;
    }
    
    
    public void removeSeance (Seance seance) {
        setSeans.remove(seance);
    }


    @Override
    public String toString() {
        return "Schedule ==> " +
                "All Seanse ==> " + setSeans;
    }
}
