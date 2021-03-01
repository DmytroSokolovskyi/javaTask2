package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Gitar gitar1 = new Gitar(7);
        Gitar gitar2 = new Gitar(5);
        Gitar gitar3 = new Gitar(8);

        Drum drum1 = new Drum(48);
        Drum drum2 = new Drum(34);
        Drum drum3 = new Drum(18);

        Trumpet trumpet1 = new Trumpet(2);
        Trumpet trumpet2 = new Trumpet(3);
        Trumpet trumpet3 = new Trumpet(4);

        List<Instryment> insrument = new ArrayList<>();
        insrument.add(gitar1);
        insrument.add(gitar2);
        insrument.add(gitar3);
        insrument.add(drum1);
        insrument.add(drum2);
        insrument.add(drum3);
        insrument.add(trumpet1);
        insrument.add(trumpet2);
        insrument.add(trumpet3);

        for (Instryment e : insrument) {
            e.play();
        }

    }
}
