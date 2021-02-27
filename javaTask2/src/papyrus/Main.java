package papyrus;

import papyrus.book.Book;
import papyrus.book.comic.Comic;
import papyrus.book.magazine.Magazine;

public class Main {
    public static void main(String[] args) {

//        Papyrus list = new Papyrus("Cyperus papyrus", "зеленый");
//        Book book = new Book( 200, "computer technology");

        Magazine magazine = new Magazine("papyrus", "RGB", 25, "Web development", "Java", true);
        Comic comic = new Comic("papyrus", "RGB", 20, "Programing", "JS");

        System.out.println(magazine);
        System.out.println(comic);


    }
}

