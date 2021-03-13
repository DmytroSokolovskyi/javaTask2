package Task;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Vova", 19, Sex.MALE);
        User user2 = new User(2, "Ivan", 21, Sex.MALE);
        User user3 = new User(3, "Vira", 18, Sex.FEMALE);
        User user4 = new User(4, "Anna", 25, Sex.FEMALE);
        User user5 = new User(5, "Olya", 17, Sex.FEMALE);
        User user6 = new User(6, "Katya", 19, Sex.FEMALE);
        User user7 = new User(7, "Denus", 22, Sex.MALE);
        User user8 = new User(8, "Oleg", 23, Sex.MALE);
        User user9 = new User(9, "Nikita", 16, Sex.MALE);
        User user10 = new User(10, "Vika", 20, Sex.FEMALE);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);


        Stream<User> stream = users.stream();
//        - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//stream.filter(u -> u.getId() % 2 == 0).forEach(System.out::println);



//        - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//        stream.filter(u -> u.getName().length() > 5).forEach(System.out::println);


//        - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
        stream.filter(u -> u.getSex().equals(Sex.FEMALE)).forEach(System.out::println);

    }
}
