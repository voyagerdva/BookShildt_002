package e0084_Annotations_3;

import e0082_Annotations.MyAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "IT IS ANNOTATION OF TEST CLASS")
@MyAnno(str = "Anno for class Metta 3", val = 111)
public class Meta3 {

    @What(description = "IT IS ANNOTATION OF TEST METHOD")
    @MyAnno(str = "Anno for Method myMeth", val = 122)
    public static void myMeth() {
        Meta3 obj = new Meta3();

        try {
            Annotation annos[] = obj.getClass().getAnnotations();

            System.out.println("ALL ANNOTATIONS FOR CLASS META3:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            Method m = obj.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("ALL ANNOTATIONS FOR METHOS myMeth():");
            for (Annotation a : annos) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException e) {
            System.err.println("Method not found!!!!!!!!!!!!!!!");
            e.printStackTrace();
            System.err.println("Method not found!!!!!!!!!!!!!!!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
