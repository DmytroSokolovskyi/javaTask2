package clothes;

public class T_shirt extends Clothes
        implements MenClothes, WomenClothers {

    public T_shirt() {
    }

    public T_shirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressMan() {

        System.out.println("Одеваю мужскую футболку");
    }

    @Override
    public void toDressWoman() {
        System.out.println("Одеваю женскую футболку");
    }

    @Override
    public String toString() {
        return "T_shirt{} " + super.toString();
    }
}
