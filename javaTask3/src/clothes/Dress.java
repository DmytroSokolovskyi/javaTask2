package clothes;

public class Dress extends Clothes
        implements WomenClothers{

    public Dress() {
    }

    public Dress(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressWoman() {
 System.out.println("Одела платье");
    }

    @Override
    public String toString() {
        return "Dress{} " + super.toString();
    }
}
