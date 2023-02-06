package e0082_Annotations;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "EXAMPLE ANNOTATION", val = 111)
    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> cl = ob.getClass();
            Method meth = cl.getMethod("myMeth");

            MyAnno anno = meth.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
