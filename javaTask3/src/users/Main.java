package users;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        User Dima = new User(1, "Dima", 32, Sex.MALE);
        User Vova = new User(2, "Vova", 31, Sex.MALE);
        User Nadia = new User(3, "Nadia", 29, Sex.FEMALE);
        User Kolya = new User(4, "Kolya", 22, Sex.MALE);
        User Katya = new User(5, "Katya", 19, Sex.FEMALE);
        User Oksana = new User(6, "Oksana", 26, Sex.FEMALE);
        User Marina = new User(7, "Marina", 27, Sex.FEMALE);
        User Igor = new User(8, "Igor", 30, Sex.MALE);
        User Petro = new User(9, "Petro", 34, Sex.MALE);
        User Oleg = new User(10, "Oleg", 28, Sex.MALE);

        ArrayList<User> users = new ArrayList<>();
        users.add(Dima);
        users.add(Vova);
        users.add(Nadia);
        users.add(Kolya);
        users.add(Katya);
        users.add(Oksana);
        users.add(Marina);
        users.add(Igor);
        users.add(Petro);
        users.add(Oleg);

        for (User u : users) {
            if (u.getId() % 2 == 0) {
                System.out.println("Парне ID в " + u);
            }
        }

        for (User u : users) {
            if (u.getName().length() > 5) {
                System.out.println("Им'я больше 5 символов у " + u);
            }
        }
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getSex() == Sex.FEMALE) {
                 System.out.println("Женщина у нас " + user);
            }
            
        }

    }
}
