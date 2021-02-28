package clothes;

public class Pants  extends Clothes
        implements MenClothes, WomenClothers{

    public Pants() {
    }

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("Одеваю мужские брюки");
    }

    @Override
    public void toDressWoman() {
        System.out.println("Одеваю женские брюки");
    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }
}
