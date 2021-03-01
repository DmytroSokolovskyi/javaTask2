package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book(1, "IT Start");
        Book book2 = new Book(2, "Bykvar");
        Book book3 = new Book(3, "Biologi");
        Book book4 = new Book(4, "Rykodelie");
        Book book5 = new Book(5, "JavaWorld");


        Magazine magazine1 = new Magazine(1, "Cars");
        Magazine magazine2 = new Magazine(2, "Mobile");
        Magazine magazine3 = new Magazine(3, "Farbs");
        Magazine magazine4 = new Magazine(4, "Java");
        Magazine magazine5 = new Magazine(5, "IT");

        ArrayList<Printable> printable = new ArrayList<>();
        printable.add(book1);
        printable.add(book2);
        printable.add(book3);
        printable.add(book4);
        printable.add(book5);

        printable.add(magazine1);
        printable.add(magazine2);
        printable.add(magazine3);
        printable.add(magazine4);
        printable.add(magazine5);

//for (Printable i : izdanie) {
//    i.print();
//}

Book.printBooks(printable);
Magazine.printMagazines(printable);


    }
}
