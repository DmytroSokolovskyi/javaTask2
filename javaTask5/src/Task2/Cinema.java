package Task2;

import lombok.*;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public class Cinema {
    private TreeMap<Days, Schedule> treeMap;
    private Time open;
    private Time close;


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

    public void addSeance(Seance seance, Days day) {

        treeMap.get(day).addSeance(seance);
    }

    public void addSeances( Days day, Seance... seances) {
        for (Seance seance : seances)
            treeMap.get(day).addSeance(seance);

    }
    public void removeMovie (String title) {
        for (Map.Entry<Days, Schedule> entry : treeMap.entrySet()) {
            Iterator<Seance> iter = entry.getValue().getSetSeans().iterator();
            while (iter.hasNext()) {
                if (iter.next().getMovie().getTitle().equals(title)) {
                    iter.remove();
                }
            }
        }
    }

    public void removeSeance(Seance seance, Days day) {
        treeMap.get(day).removeSeance(seance);
    }


    @Override
    public String toString() {
        return "Cinema{" +
                "on this Week" + treeMap +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}
