package e0093_Type_Templates_3_GenObj;

public class Gen2<N> {
    N ob;

    Gen2(N o) {
        ob = o;
    }

    N getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is: " + ob.getClass().getName());
    }

}
