package e0093_Type_Templates_3_GenObj;

public class GenObj2 {
    Object ob;

    GenObj2(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is: " + ob.getClass().getName());
    }
}
