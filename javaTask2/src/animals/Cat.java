package animals;

import animals.Mammals;

public class Cat extends Mammals {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int sum, String subgroup, boolean wild, String name) {
        super(sum, subgroup, wild);
        this.name = name;
    }

    public Cat(String area, String group, int sum, String subgroup, boolean wild, String name) {
        super(area, group, sum, subgroup, wild);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void live() {
         System.out.println(name + ":don't break me I'm sleeping");
    }

    @Override
    public String toString() {
        return "animals.Cat{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
