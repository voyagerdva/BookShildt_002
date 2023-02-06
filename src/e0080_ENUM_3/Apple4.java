package e0080_ENUM_3;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

@Scheduled

final public class Apple4 {
    final public static Apple4 RED = new Apple4(1, "RRR1");
    final public static Apple4 GREEN = new Apple4(2, "GGG2");
    final public static Apple4 BLUE = new Apple4(3, "BBB3");

    private int number;
    private String kind;

    Apple4(int i, String s) {
        number = i;
        kind = s;
    }

    @Schedul(cron="")
    public static Apple4 valueOf(String name) {

        try {

            Apple4 apple4_1 = Apple4.class.getConstructor(Apple4.class).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Field field = Arrays.stream(Apple4.class.getFields()).filter(
                f -> f.getName().equals(name)
        ).findFirst().get();

        Apple4 f = null;
        try {
            f = (Apple4) field.get(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return f;
    }
}
