package papyrus.book.magazine;

import papyrus.book.Book;

public class Magazine  extends Book {
    private String info;
    private boolean gloss;

    public Magazine() {
    }

    public Magazine(String info, boolean gloss) {
        this.info = info;
        this.gloss = gloss;
    }

    public Magazine(int sumList, String genre, String info, boolean gloss) {
        super(sumList, genre);
        this.info = info;
        this.gloss = gloss;
    }

    public Magazine(String madeOf, String color, int sumList, String genre, String info, boolean gloss) {
        super(madeOf, color, sumList, genre);
        this.info = info;
        this.gloss = gloss;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isGloss() {
        return gloss;
    }

    public void setGloss(boolean gloss) {
        this.gloss = gloss;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "info='" + info + '\'' +
                ", gloss=" + gloss +
                "} " + super.toString();
    }
}
