package clothes;


public class Main {
    public static void main(String[] args) {

        Clothes t_shirt = new T_shirt(Size.XL, 120, "red");
        Clothes pants = new Pants(Size.M, 243, "white");
        Clothes dress = new Dress(Size.L, 445, "gray");
        Clothes tie = new Tie(Size.L, 156, "black");

        Clothes[] allClothes = new Clothes[4];
        allClothes[0] = t_shirt;
        allClothes[1] = pants;
        allClothes[2] = dress;
        allClothes[3] = tie;


        Atelier atelier = new Atelier(allClothes);
        atelier.toManSelect();
        atelier.toWomanSelect();

    }
}
