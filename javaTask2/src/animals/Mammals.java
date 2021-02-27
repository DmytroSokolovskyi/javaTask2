package animals;

public class Mammals extends Animal{
    private int sum;
    private String subgroup;
    private boolean wild;

    public Mammals() {
    }

    public Mammals(int sum, String subgroup, boolean wild) {
        this.sum = sum;
        this.subgroup = subgroup;
        this.wild = wild;
    }

    public Mammals(String area, String group, int sum, String subgroup, boolean wild) {
        super(area, group);
        this.sum = sum;
        this.subgroup = subgroup;
        this.wild = wild;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    @Override
    public void live() {
         System.out.println("I live near you");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "sum=" + sum +
                ", subgroup='" + subgroup + '\'' +
                ", wild=" + wild +
                "} " + super.toString();
    }
}
