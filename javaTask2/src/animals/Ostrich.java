package animals;

public class Ostrich  extends Birds  {
    private int weight;
    private int height;

    public Ostrich() {
    }

    public Ostrich(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public Ostrich(int wingspan, String subclass, boolean fly, int weight, int height) {
        super(wingspan, subclass, fly);
        this.weight = weight;
        this.height = height;
    }

    public Ostrich(String area, String group, int wingspan, String subclass, boolean fly, int weight, int height) {
        super(area, group, wingspan, subclass, fly);
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ostrich{" +
                "weight=" + weight +
                ", height=" + height +
                "} " + super.toString();
    }
}
