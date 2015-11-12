import annotated.Utils;
import doc.DocProcessor;

import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        Class<?> clazz = Utils.class;
        DocProcessor.process(clazz);
    }
}
