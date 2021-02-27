package papyrus;

public class Papyrus {
    private String madeOf;
    private String color;

    public Papyrus() {
    }

    public Papyrus(String madeOf, String color) {
        this.madeOf = madeOf;
        this.color = color;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info () {
         System.out.println("Все начиналось с " + madeOf + " у которого цвет " + color);
    }
    
    @Override
    public String toString() {
        return "Papyrus{" +
                "madeOf='" + madeOf + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
