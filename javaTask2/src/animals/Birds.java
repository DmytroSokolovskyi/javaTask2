package animals;

public class Birds extends Animal{
    private int wingspan;
    private String subclass;
    private boolean fly;

    public Birds() {
    }

    public Birds(int wingspan, String subclass, boolean fly) {
        this.wingspan = wingspan;
        this.subclass = subclass;
        this.fly = fly;
    }

    public Birds(String area, String group, int wingspan, String subclass, boolean fly) {
        super(area, group);
        this.wingspan = wingspan;
        this.subclass = subclass;
        this.fly = fly;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public void live() {
         System.out.println("I see more food");
    }

    public void fly() {
         System.out.println("Fly is my life");
    }


    @Override
    public String toString() {
        return "Birds{" +
                "wingspan=" + wingspan +
                ", subclass='" + subclass + '\'' +
                ", fly=" + fly +
                "} " + super.toString();
    }
}
