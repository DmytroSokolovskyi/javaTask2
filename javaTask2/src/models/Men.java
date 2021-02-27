package models;

public class Men implements MenClothes {
    private int age;
    private String name;

    public Men() {
    }

    public Men(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void todressMen() {
        System.out.println("2 минуты и ты одет");
    }

    @Override
    public String toString() {
        return "Men{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


