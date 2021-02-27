package animals;

import java.util.Arrays;

public class Chicken extends Birds {
    private String[] info;
    private boolean gives_eggs;

    public Chicken() {
    }

    public Chicken(String[] info, boolean gives_eggs) {
        this.info = info;
        this.gives_eggs = gives_eggs;
    }

    public Chicken(int wingspan, String subclass, boolean fly, String[] info, boolean gives_eggs) {
        super(wingspan, subclass, fly);
        this.info = info;
        this.gives_eggs = gives_eggs;
    }

    public Chicken(String area, String group, int wingspan, String subclass, boolean fly, String[] info, boolean gives_eggs) {
        super(area, group, wingspan, subclass, fly);
        this.info = info;
        this.gives_eggs = gives_eggs;
    }

    public String[] getInfo() {
        return info;
    }

    public void setInfo(String[] info) {
        this.info = info;
    }

    public boolean isGives_eggs() {
        return gives_eggs;
    }


    public void setGives_eggs(boolean gives_eggs) {
        this.gives_eggs = gives_eggs;
    }

    @Override
    public void live() {
         System.out.println("Eggs are very useful");
    }

    @Override
    public String toString() {
        return "Сhicken{" +
                "info=" + Arrays.toString(info) +
                ", gives_eggs=" + gives_eggs +
                "} " + super.toString();
    }
}
