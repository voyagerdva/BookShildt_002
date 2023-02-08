package e0091_Type_Templates;

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