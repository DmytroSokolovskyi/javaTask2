package clothes;

public enum Size {
    XXL(100),
    XL(80),
    S(60),
    M(40),
    L(20);

    int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDescription() {
        System.out.println(euroSize);
    }

    @Override
    public String toString() {
        return "Size{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}
