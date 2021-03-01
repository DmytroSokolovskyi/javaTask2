package task1;

import java.util.ArrayList;

public class Magazine implements Printable{
    private int id;
    private String name;

    public Magazine() {
    }

    public Magazine(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("I'm Magazine " + id);
    }

    static void printMagazines(ArrayList<Printable> printable) {
        for ( Printable p : printable) {
            if ( p instanceof Magazine) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
