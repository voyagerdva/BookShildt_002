package e0080_ENUM_3;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 ap;

        System.out.println("APPLE OF KIND REDDEL COST:" +
                Apple3.RedDel.getPrice() + " CENTS.\n");

        System.out.println("ALL PRICE OF ALL APPLES:");
        for (Apple3 a : Apple3.values()) {
            System.out.println(a + " COST " + a.getPrice() + " cents.");
        }

        Apple4 apple4 = Apple4.valueOf("RED");
        System.out.println(apple4);
    }
}
