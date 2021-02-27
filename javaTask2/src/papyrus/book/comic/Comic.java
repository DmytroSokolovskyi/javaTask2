package papyrus.book.comic;

import papyrus.book.Book;

public class Comic extends Book {
    private String name;

    public Comic() {
    }

    public Comic(String name) {
        this.name = name;
    }

    public Comic(int sumList, String genre, String name) {
        super(sumList, genre);
        this.name = name;
    }

    public Comic(String madeOf, String color, int sumList, String genre, String name) {
        super(madeOf, color, sumList, genre);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
