package task2;

public class Gitar  implements Instryment{
    private int sumstrune;

    public Gitar() {
    }

    public Gitar(int sumstrune) {
        this.sumstrune = sumstrune;
    }

    public int getSumstrune() {
        return sumstrune;
    }

    public void setSumstrune(int sumstrune) {
        this.sumstrune = sumstrune;
    }


    @Override
    public void play() {
         System.out.println("Play Gitare with " + sumstrune + " stryne" );
    }

    @Override
    public String toString() {
        return "Gitar{" +
                "sumstrune=" + sumstrune +
                '}';
    }
}
