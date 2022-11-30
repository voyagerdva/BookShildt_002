package e0051_Inheritance_2;

public class RefDemoMain {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box51 plainbox = new Box51();

        plainbox = weightbox;

        System.out.println(plainbox);
    }
}
