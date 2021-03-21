package Task2;

import lombok.*;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class Seance implements Comparable<Seance>{
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = this.movie.givEndTime(this.startTime);
    }

    @Override
    public int compareTo(Seance o) {
        return this.startTime.getHour() - o.startTime.getHour();
    }

    @Override
    public String toString() {
        return  movie +
                ", start " + startTime +
                ", end " + endTime;
    }
}
