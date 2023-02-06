package e0078_ENUM;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;
        System.out.println("VALUE OF ap: " + ap);

        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("VARIABLE ap CONTAINS GOLDENDEL.\n");
        }

        switch (ap) {
            case Jonatan:
                System.out.println("KIND JONATHAN IS RED.");
                break;
            case GoldenDel:
                System.out.println("KIND GOLDEN_DEL IS YELLOW.");
                break;
            case RedDel:
                System.out.println("KIND RED_DEL IS RED.");
                break;
        }

        for (Apple a : Apple.values()) {
            System.out.println("PRICE OF EACH APPLE: " + a + " : " + a.getPrice());
        }
    }
}
