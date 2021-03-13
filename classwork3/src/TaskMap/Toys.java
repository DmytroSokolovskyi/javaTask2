package TaskMap;

import java.util.Objects;

public class Toys {
    private int size;
    private int age;

    public Toys() {
    }

    public Toys(int size, int age) {
        this.size = size;
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toys toys = (Toys) o;
        return size == toys.size && age == toys.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, age);
    }


    @Override
    public String toString() {
        return "Toys{" +
                "size=" + size +
                ", age=" + age +
                '}';
    }
}

