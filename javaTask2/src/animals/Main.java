package animals;

public class Main {
    public static void main(String[] args) {

//        Створити по одному елементу кожного типу.
        Animal tiger = new Animal("Earth", "Vertebrates");
        tiger.live();
        Mammals hors = new Mammals("Earth", "Vertebrates", 2341231, "Mammalia", false);
        hors.live();
        Birds eagle = new Birds("Earth", "Vertebrates", 2, "Aves", true);
        eagle.live();
        eagle.fly();
        Dog bobik = new Dog(1, "Mammalia", false, "Doberman");
        bobik.live();
        Cat mysik = new Cat("Musik");

        String[] Сhicken_info = new String[2];
        Сhicken_info[0] = "grill";
        Сhicken_info[1] = "meat";
        Chicken chicken = new Chicken(Сhicken_info, true);
        Ostrich ostrich = new Ostrich(146, 124);


//        Створити масив кожного типу, пофасувати всі елементи по можливих масивах, які підходять їм за типом
//
//        Animal[] animals = {tiger, hors, eagle, bobik, mysik, chicken, ostrich};

        Animal[] animals = new Animal[7];
        animals[0] = tiger;
        animals[1] = hors;
        animals[2] = eagle;
        animals[3] = bobik;
        animals[4] = mysik;
        animals[5] = chicken;
        animals[6] = ostrich;

//        Mammals[] mammals = {hors, bobik, mysik};

        Mammals[] mammals = new Mammals[3];
        mammals[0] = hors;
        mammals[1] = bobik;
        mammals[2] = mysik;
//        Birds[] birds = {eagle, chicken, ostrich };

        Birds[] birds = new Birds[3];
        birds[0] = eagle;
        birds[1] = chicken;
        birds[2] = ostrich;

 //        Dog[] dogs = {bobik};

        Dog[] dogs = new Dog[1];
        dogs[0] = bobik;

//        Cat[] cats = {mysik};

        Cat[] cats = new Cat[1];
        cats[0] = mysik;

//        Chicken[] chickens = {chicken};

        Chicken[] chickens = new Chicken[1];
        chickens[0] = chicken;

//        Ostrich[] ostrichs = {ostrich};

        Ostrich[] ostrichs = new Ostrich[1];
        ostrichs[0] = ostrich;




        System.out.println(tiger);
        System.out.println(hors);
        System.out.println(eagle);
        System.out.println(bobik);
        System.out.println(mysik);
        System.out.println(chicken);
        System.out.println(ostrich);

    }
}
