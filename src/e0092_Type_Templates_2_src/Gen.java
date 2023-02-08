package e0092_Type_Templates_2_src;

public class Gen<N> {
    N ob;

    Gen(N o) {
        ob = o;
    }

    N getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is: " + ob.getClass().getName());
    }

}
//