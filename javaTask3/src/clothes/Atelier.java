package clothes;



public class Atelier {
    private Clothes[] clothes;


    public Atelier() {
    }

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public void toManSelect() {
        for (Clothes c : clothes) {
            if (c instanceof MenClothes) {
                System.out.println( "Мужская " + c);
            }
        }
    }

    public void toWomanSelect() {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothers) {
                System.out.println( "Женская " + c);
            }
        }
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "clothes=" + clothes +
                '}';
    }
}

