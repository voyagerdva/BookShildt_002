package e0050_Inheritance_GOOD_SPLIT_TO_GROUP_OPCODS;

public class SimpleInheritanceMain {
    public static void main(String[] args) {
        CCC superObj = new CCC();
        BBB subObj = new BBB();

        superObj.i = 10;
        superObj.j = 20;
        System.out.println("SuperObj contains: ");
        superObj.show_ij();
        System.out.println();

        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;

        System.out.println("subObj contains: ");
        subObj.show_ij();
        subObj.show_k();

        System.out.println();
        System.out.println("The summ of i, j, k in subObj: ");
        subObj.summ();
    }
}
