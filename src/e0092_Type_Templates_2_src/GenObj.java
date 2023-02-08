package e0092_Type_Templates_2_src;

public class GenObj {
    Object ob;

    GenObj(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is: " + ob.getClass().getName());
    }
}
//