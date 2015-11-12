package annotated;

import doc.Doc;

@Doc(
        description = "This is util class"
)
public class Utils {
    @Doc(
            description = "method that return 1",
            returnValue = "return integer 1"
    )
    public static int one() {
        return 1;
    }

    @Doc(
            description = "",
            params = {"first number", "second number"},
            returnValue = "sum of two numbers "
    )
    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
}
