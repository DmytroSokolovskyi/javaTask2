package papyrus.book;

import papyrus.Papyrus;

public class Book extends Papyrus {
    private int sumList;
    private String genre;

    public Book() {
    }

    public Book(int sumList, String genre) {
        this.sumList = sumList;
        this.genre = genre;
    }

    public Book(String madeOf, String color, int sumList, String genre) {
        super(madeOf, color);
        this.sumList = sumList;
        this.genre = genre;
    }

    public int getSumList() {
        return sumList;
    }

    public void setSumList(int sumList) {
        this.sumList = sumList;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void info() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "sumList=" + sumList +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
