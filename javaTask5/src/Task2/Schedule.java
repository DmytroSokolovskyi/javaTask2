package Task2;

import lombok.*;

import java.util.Set;
import java.util.TreeSet;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Schedule {

    private Set<Seance> set;

    public Schedule(Set<Seance> set) {
        this.set = new TreeSet <Seance>();
    }

}
