import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {

    public void showClassNAme(Object o) {
        System.out.println(o.getClass().getCanonicalName());
    }

    public void showClassFields(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();

        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }

    public void showClassMethods(Object o) {
        Method[] methods = o.getClass().getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

    public void showClassAnnotaions(Object o) {

        Field[] fields = o.getClass().getDeclaredFields();

        for (Field f : fields) {
            Annotation[] annotations = f.getDeclaredAnnotations();
            for (Annotation a : annotations) {
                System.out.println(f.getName() + " - has this annotation : " + a.toString());
            }
        }
    }


}
