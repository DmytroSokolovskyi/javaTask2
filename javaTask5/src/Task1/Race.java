package Task1;

public enum Race {
    DOG("Dog"),
    CAT("Cat"),
    RABBIT("Rabbit");


    String race;

    Race(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
