package e0092_Type_Templates_2_src;

public class GenDemo0 {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        GenObj iOb1;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Value v: " + v);

        Gen<String> strOb = new Gen<String>("Some message");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value str: " + str);
    }
}
//
//