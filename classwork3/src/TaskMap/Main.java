package TaskMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map myToys = new HashMap();


        Toys toys1 = new Toys(5, 6);

        myToys.put("Barbi", toys1);
        myToys.put("Ken", new Toys(7, 4));
        myToys.put("Car", new Toys(10, 5));
        myToys.put("Rubik", new Toys(3, 4));
        myToys.put("Book", new Toys(8, 6));

        System.out.println(myToys);

        Set entrySet = myToys.entrySet();
        System.out.println(entrySet);


        Set keySet = myToys.keySet();
        System.out.println(keySet);

        Collection values = myToys.values();
        System.out.println(values);


        for (Object key : myToys.keySet()) {
            if (key.toString().startsWith("B")) {
                System.out.println(key);
            }
        }

//        создать лист со значений мапы где size > 100

        for (Object key : myToys.values()) {
            System.out.println(key);
            for (key)
        }
    }

}

