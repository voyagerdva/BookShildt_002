package e0071_Threads_from_MEDIUM;

public class RaceStarter {
    public static void main(String[] args) {
        Racer[] racer = new Racer[4];

        for (int i = 0; i < 4; i++) {
            racer[i] = new Racer(i);
        }

        racer[0].setPriority(7);
        racer[1].setPriority(7);
        racer[3].setPriority(3);

        for (int i = 0; i < 4; i++) {
            racer[i].start();
        }
    }
}
