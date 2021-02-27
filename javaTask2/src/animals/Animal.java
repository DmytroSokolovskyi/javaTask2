package animals;

public class Animal {
    private String area;
    private String group;

    public Animal() {
    }

    public Animal(String area, String group) {
        this.area = area;
        this.group = group;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public void live () {
   System.out.println("I want to eat");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "area='" + area + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}

