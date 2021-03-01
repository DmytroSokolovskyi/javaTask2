package task2;

public class Drum  implements Instryment{
    private int rozmer;

    public Drum() {
    }

    public Drum(int rozmer) {
        this.rozmer = rozmer;
    }

    public int getRozmer() {
        return rozmer;
    }

    public void setRozmer(int rozmer) {
        this.rozmer = rozmer;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "rozmer=" + rozmer +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Play Drum with" + rozmer  );
    }
}
