package models;

public class Main {
    public static void main(String[] args) {
        Men men = new Men(21, "Romeo");
        Woman woman = new Woman(1,false);

        men.todressMen();
        woman.todressWomen();
    }
}
