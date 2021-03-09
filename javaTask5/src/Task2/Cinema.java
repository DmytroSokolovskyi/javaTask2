package Task2;

import lombok.*;

import java.util.Set;
import java.util.TreeMap;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class Cinema {

    private TreeMap<Days, Schedule> treeMap;
    private Time open;
    private Time close;

    public Cinema(Time open, Time close) {
        this.treeMap = new TreeMap<>();
        this.open = open;
        this.close = close;
    }

    public void setTreeMap(TreeMap<Days, Schedule> treeMap) {
        this.treeMap = treeMap;
    }

    public void setOpen(Time open) {

        if (open.getHour() < 10) {
            System.out.println("error");
        }
        this.open = open;
    }

    public void setClose(Time close) {
        if (close.getHour() > 23) {
            System.out.println("error");
        }

        this.close = close;
    }

    public void addSeances(Schedule s, Days day, Seance seances) {


    }


    public void addSeance(Schedule seance, Days day) {
        treeMap.put(day, seance);
    }

}
