## Java annotations project
This is java annotations project

Java standard annotations:
- @Override
- @Deprecated
- @SuppressWarnings({"static"})


### javac and java commands
 - javac -cp src src/com/company/Main.java
 - java -cp src com.company.Main
 
 - javac -d bin src/com/company/Main.java
 - java -cp bin com.company.Main
 
 - javac -Xlint -d bin -cp src src/com.company/Main.java 

### Custom annotation
- `public @interface Name`
- retention
- retention policy
    * source (remove from bytecode)
    * class (stay in bytecode)
    * runtime (available at runtime)
- target (where it will be used)
    * element type
        * type (for class)
        * method
- elements and attributes
    - String name() default "";