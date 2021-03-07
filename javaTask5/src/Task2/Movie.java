package Task2;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Movie {
    private String title;
    private Time duration;

    public Time givEndTime( Time startTime) {
        Time sumTime = startTime.sumTime(this.duration);
        return sumTime;
    }
}
