package weeks12;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Custom {
    String name() default "hello";
    int age();
}
