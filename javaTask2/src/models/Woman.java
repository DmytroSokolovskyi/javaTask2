package models;

public class Woman implements WomenClothes {
    private int id;
    private boolean haveDress;

    public Woman() {
    }

    public Woman(int id, boolean haveDress) {
        this.id = id;
        this.haveDress = haveDress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isHaveDress() {
        return haveDress;
    }

    public void setHaveDress(boolean haveDress) {
        this.haveDress = haveDress;
    }

    @Override
    public void todressWomen() {
        if (haveDress) {
            System.out.println("Часик и ты одета");
        } else {
            System.out.println("Сиди дома");
        }

    }

    @Override
    public String toString() {
        return "Woman{" +
                "id=" + id +
                ", haveDress=" + haveDress +
                '}';
    }

}
