package e0056_Exception_1;

public class ExcepRun {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        subroutine();
        ExcepRun.subroutine();
    }
}
