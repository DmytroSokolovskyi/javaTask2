package clothes;

public class Tie extends Clothes 
        implements MenClothes{

    public Tie() {
    }

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void toDressMan() {
         System.out.println("Завязываю галстук");
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
