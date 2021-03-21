package Task1;

import lombok.*;

import java.util.Objects;


public class Pet {
    private Race race;
    private String name;

    public Pet() {
    }

    public Pet(Race race, String name) {
        this.race = race;
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return race == pet.race && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(race, name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "race=" + race +
                ", name='" + name + '\'' +
                '}';
    }
}
