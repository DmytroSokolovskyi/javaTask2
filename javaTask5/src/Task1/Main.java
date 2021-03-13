package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//public class Main {
//
//    public static void main(String[] args) {
//
//        Person vasya = new Person("Vasya", 24);
//        Person petya = new Person("Petya", 27);
//        Person oleg = new Person("Oleg", 35);
//        Person vitya = new Person("Vitya", 32);
//
//
//        Pet bars = new Pet(Race.DOG, "Bars");
//        Pet rex = new Pet(Race.DOG, "Rex");
//        Pet zevs = new Pet(Race.DOG, "Zevs");
//
//        Pet cat1 = new Pet(Race.CAT, "Masya");
//        Pet cat2 = new Pet(Race.CAT, "Puf");
//        Pet cat3 = new Pet(Race.CAT, "Tom");
//
//        Pet rabbit1 = new Pet(Race.RABBIT, "Sem");
//        Pet rabbit2 = new Pet(Race.RABBIT, "Mia");
//        Pet rabbit3 = new Pet(Race.RABBIT, "Dio");
//
//        ArrayList<Pet> petGrop1 = new ArrayList<>();
//        petGrop1.add(rex);
//        petGrop1.add(cat3);
//        petGrop1.add(rabbit2);
//
//        ArrayList<Pet> petGrop2 = new ArrayList<>();
//        petGrop2.add(bars);
//        petGrop2.add(cat2);
//        petGrop2.add(rabbit1);
//
//        Map<Person, List<Pet>> zooClub = new HashMap<>();
//
//
////        1) додати учасника в клуб;
//
//
//        zooClub.put(vasya, petGrop2);
//        zooClub.put(petya, petGrop1);
//
//        zooClub.put(oleg, new ArrayList<>());
//        zooClub.put(vitya, new ArrayList<>());
//
//        System.out.println(zooClub);
//
//
////       2) додати тваринку до учасника клубу.
//
//
//        zooClub.get(oleg).add(cat1);
//        zooClub.get(oleg).add(rabbit3);
//        zooClub.get(oleg).add(zevs);
//        zooClub.get(vitya).add(cat2);
//        zooClub.get(vitya).add(new Pet(Race.RABBIT, "Dodo"));
//
//        System.out.println(zooClub);
//
//
////        3) видалити тваринку з власника.
//
//        zooClub.get(vasya).remove(bars);
//
//        System.out.println(zooClub);
//
////        4) видалити учасника клубу.
//
//        zooClub.remove(vasya);
//
//        System.out.println(zooClub);
//
////        5) видалити конкретну тваринку з усіх власників.
//
//        zooClub.forEach((person, pets) -> {
//            pets.removeIf(pet -> pet.getRace().equals(Race.DOG));
//        });
////        6) вивести на екран зооклуб.
//
//        zooClub.forEach((person, pets) -> {
//             System.out.println(person);
//                    Iterator<Pet> iterator = pets.iterator();
//                   while (iterator.hasNext()) {
//                       Pet next = iterator.next();
//                       System.out.println(next);
//                   }
//                }
//        );
//
//    }
//}


public class Main {
    public static void printMenu() {
        System.out.println("1) додати учасника в клуб");
        System.out.println("2) додати тваринку до учасника клубу.");
        System.out.println("3) видалити тваринку з власника");
        System.out.println("4) видалити учасника з клубу");
        System.out.println("5) видалити конкретну тваринку з усіх власників");
        System.out.println("6) Вивести на екран Зооклуб");
    }

    public static void outputZooPark(ZooClub zooClub) {
        for (Map.Entry<Person, List<Pet>> mapZoo : zooClub.getClub().entrySet()) {
            System.out.println(mapZoo.getKey().toString() + " : " + mapZoo.getValue().toString());
        }
    }


    public static void main(String[] args) throws IOException {
        Map<Person, List<Pet>> zoopark = new HashMap<>();
        zoopark.put(new Person("Dasha", 29),
                new ArrayList<>(Arrays.asList(
                        new Pet(Race.CAT, "Bazuka"),
                        new Pet(Race.CAT, "Lolo"),
                        new Pet(Race.RABBIT, "Vasilij"))));
        zoopark.put(new Person("Sveta", 35),
                new ArrayList<>(Arrays.asList(
                        new Pet(Race.CAT, "Matilda"),
                        new Pet(Race.RABBIT, "Mudraja"))));
        zoopark.put(new Person("Valja", 50),
                new ArrayList<>(Arrays.asList(
                        new Pet(Race.DOG, "Sharik"),
                        new Pet(Race.RABBIT, "Kesha"))));
        zoopark.put(new Person("Alina", 15),
                new ArrayList<>(Arrays.asList(
                        new Pet(Race.RABBIT, "Fillip"),
                        new Pet(Race.DOG, "Chernysh"))));
        ZooClub zooClub = new ZooClub(zoopark);

        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            printMenu();
            String choice = reader.readLine();
            switch (choice) {

                case "1":
                    System.out.println("Введіть ім'я нового учасника: ");
                    String name = reader.readLine();
                    System.out.println("Введіть вік нового учасника: ");
                    int age = 0;
                    try {
                        age = Integer.parseInt(reader.readLine());
                    } catch (Exception e) {
                        System.out.println("Вы невірно ввели вік! Спробуйте наново!");
                        break;
                    }
                    zoopark.put(new Person(name, age), new ArrayList<>());
                    System.out.println("Успішно!");
                    break;

                case "2":
                    System.out.println("Введіть ім'я власника, котрому хочете додати тваринку: ");
                    name = reader.readLine();
                    Person pers = null;
                    for (Map.Entry<Person, List<Pet>> mapa : zooClub.getClub().entrySet()) {
                        if (mapa.getKey().getName().equals(name)) {
                            pers = mapa.getKey();
                            System.out.println("Тварини бувають такі: " + Arrays.toString(Race.values()));
                            System.out.println("Введіть рід тваринки: ");
                            String breed = reader.readLine();
                            Race breed1 = null;
                            for (Race c : Race.values()) {
                                if (c.name().equals(breed)) {
                                    breed1 = c;
                                }
                            }
                            if (breed1 == null) {
                                System.out.println("Ви невірно ввели рід тваринки! Спробуйте наново!");
                                break;
                            }
                            System.out.println("Введіть ім'я тваринки: ");
                            String petName = reader.readLine();
                            mapa.getValue().add(new Pet(Race.valueOf(breed), petName));
                            break;
                        }
                    }
                    if (pers == null) System.out.println("Немає такого учасника! Спробуйте наново!");
                    break;

                case "3":
                    System.out.println("Введіть ім'я власника, в котрого хочете видалити тваринку: ");
                    name = reader.readLine();
                    pers = null;
                    for (Map.Entry<Person, List<Pet>> mapa : zooClub.getClub().entrySet()) {
                        if (mapa.getKey().getName().equals(name)) {
                            pers = mapa.getKey();
                            System.out.println("У цього учасника є такі тварини: " + mapa.getValue().toString());
                            System.out.println("Тварини бувають такі: " + Arrays.toString(Race.values()));
                            System.out.println("Введіть рід тваринки, яку бажаєте видалити: ");
                            String breed = reader.readLine();
                            Race breed1 = null;
                            for (Race c : Race.values()) {
                                if (c.name().equals(breed)) {
                                    breed1 = c;
                                }
                            }
                            if (breed1 == null) {
                                System.out.println("Ви невірно ввели рід! Спробуйте наново!");
                                break;
                            }
                            System.out.println("Введіть ім'я тваринки: ");
                            String petName = reader.readLine();
                            Pet pet = new Pet(breed1, petName);
                            Pet pet2 = null;
                            for (Pet pet1 : mapa.getValue()) {
                                if (pet1.equals(pet)) {
                                    pet2 = pet;
                                    break;
                                }
                            }
                            if (pet2 == null) {
                                System.out.println("Немає тваринки з таким родом та ім'ям! Спробуйте наново!");
                                break;
                            }
                            mapa.getValue().remove(pet2);
                            System.out.println(mapa);
                            System.out.println("Успішно!");
                            break;
                        }
                    }
                    if (pers == null) System.out.println("Немає такого учасника! Спробуйте наново!");
                    break;

                case "4":
                    System.out.println("Введіть ім'я власника, котрого хочете видалити: ");
                    name = reader.readLine();
                    pers = null;
                    for (Map.Entry<Person, List<Pet>> mapa : zooClub.getClub().entrySet()) {
                        if (mapa.getKey().getName().equals(name)) {
                            pers = mapa.getKey();
                            zooClub.getClub().remove(pers);
                            outputZooPark(zooClub);
                            System.out.println("Успішно!");
                            break;
                        }
                    }
                    if (pers == null) System.out.println("Немає такого учасника! Спробуйте наново!");
                    break;

                case "5":
                    System.out.println("Тварини бувають такі: " + Arrays.toString(Race.values()));
                    System.out.println("Введіть рід тваринки, яку бажаєте видалити з усіх власників:");
                    String breed = reader.readLine();
                    Race breed1 = null;
                    for (Race c : Race.values()) {
                        if (c.name().equals(breed)) {
                            breed1 = c;
                        }
                    }
                    if (breed1 == null) {
                        System.out.println("Ви невірно ввели рід тваринки! Спробуйте наново!");
                        break;
                    }

                    for (Map.Entry<Person, List<Pet>> mapa : zooClub.getClub().entrySet()) {
                        for (int a = 0; a < mapa.getValue().size(); a++) {
                            if (mapa.getValue().get(a).getRace() == breed1) {
                                mapa.getValue().remove(a);
                                a--;
                            }
                        }
                    }
                    outputZooPark(zooClub);
                    System.out.println("Успішно!");
                    break;

                case "6":
                    outputZooPark(zooClub);
                    System.out.println("Успішно!");
                    break;

                case "break":
                    flag = false;
                    break;

                default:
                    System.out.println("Оберіть пункт з меню від 1 до 6 або введіть 'break'!");
                    break;
            }
        }
    }
}
