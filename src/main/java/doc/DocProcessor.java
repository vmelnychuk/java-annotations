package doc;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DocProcessor {
    public static void process(Class<?> clazz) {
        String className = clazz.getSimpleName();
        System.out.printf("Analise of: '%s'", className);
        if(clazz.isAnnotationPresent(Doc.class)) {
            Doc classDoc = clazz.getAnnotation(Doc.class);
            String classDescription = classDoc.description();
            System.out.printf("%nDescription: %s", classDescription);
            for(Method method : clazz.getDeclaredMethods()) {
                int modifierInt = method.getModifiers();
                String methodName = method.getName();
                if(!Modifier.isPrivate(modifierInt)) {
                    System.out.printf("%n%n\t%s: ", methodName);
                    if(method.isAnnotationPresent(Doc.class)) {
                        Doc doc = method.getAnnotation(Doc.class);
                        System.out.printf("Method description %s", doc.description());
                    }
                }
            }
        }
    }
}
