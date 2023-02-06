package e0079_ENUM_2;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 ap;

        System.out.println("CONSTANTS OF APPLE2:");

        Apple2 allApples[] = Apple2.values();

        for (Apple2 a : allApples) {
            System.out.println(a);
        }

        ap = Apple2.valueOf("GoldenDel");
        System.out.println("VAR AP CONTAINS: " + ap);
    }
}
