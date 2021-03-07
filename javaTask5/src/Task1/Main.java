package Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person vasya = new Person("Vasya", 24);
        Person petya = new Person("Petya", 27);
        Person oleg = new Person("Oleg", 35);
        Person vitya = new Person("Vitya", 32);


        Pet bars = new Pet(Race.DOG, "Bars");
        Pet rex = new Pet(Race.DOG, "Rex");
        Pet zevs = new Pet(Race.DOG, "Zevs");

        Pet cat1 = new Pet(Race.CAT, "Masya");
        Pet cat2 = new Pet(Race.CAT, "Puf");
        Pet cat3 = new Pet(Race.CAT, "Tom");

        Pet rabbit1 = new Pet(Race.RABBIT, "Sem");
        Pet rabbit2 = new Pet(Race.RABBIT, "Mia");
        Pet rabbit3 = new Pet(Race.RABBIT, "Dio");

        ArrayList<Pet> petGrop1 = new ArrayList<>();
        petGrop1.add(rex);
        petGrop1.add(cat3);
        petGrop1.add(rabbit2);

        ArrayList<Pet> petGrop2 = new ArrayList<>();
        petGrop2.add(bars);
        petGrop2.add(cat2);
        petGrop2.add(rabbit1);

        Map<Person, List<Pet>> zooClub = new HashMap<>();


//        1) додати учасника в клуб;


        zooClub.put(vasya, petGrop2);
        zooClub.put(petya, petGrop1);

        zooClub.put(oleg, new ArrayList<>());
        zooClub.put(vitya, new ArrayList<>());

        System.out.println(zooClub);


//       2) додати тваринку до учасника клубу.


        zooClub.get(oleg).add(cat1);
        zooClub.get(oleg).add(rabbit3);
        zooClub.get(oleg).add(zevs);
        zooClub.get(vitya).add(cat2);
        zooClub.get(vitya).add(new Pet(Race.RABBIT, "Dodo"));

        System.out.println(zooClub);


//        3) видалити тваринку з власника.

        zooClub.get(vasya).remove(bars);

        System.out.println(zooClub);

//        4) видалити учасника клубу.

        zooClub.remove(vasya);

        System.out.println(zooClub);

//        5) видалити конкретну тваринку з усіх власників.

        zooClub.forEach((person, pets) -> {
            pets.removeIf(pet -> pet.getRace().equals(Race.DOG));
        });
//        6) вивести на екран зооклуб.

        zooClub.forEach((person, pets) -> {
             System.out.println(person);
                    Iterator<Pet> iterator = pets.iterator();
                   while (iterator.hasNext()) {
                       Pet next = iterator.next();
                       System.out.println(next);
                   } 
                }
        );
    
    }
}
