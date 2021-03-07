package Task2;

import lombok.*;

@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Seance {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = this.movie.givEndTime(this.startTime);
    }
}
