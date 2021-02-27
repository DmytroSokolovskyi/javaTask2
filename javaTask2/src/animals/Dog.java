package animals;

public class Dog  extends Mammals{
private String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(int sum, String subgroup, boolean wild, String breed) {
        super(sum, subgroup, wild);
        this.breed = breed;
    }

    public Dog(String area, String group, int sum, String subgroup, boolean wild, String breed) {
        super(area, group, sum, subgroup, wild);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void live() {
         System.out.println("Go play with me");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
