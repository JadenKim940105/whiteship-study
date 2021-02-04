package weeks12;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@Custom(age = 10)
public class Test {
    public static void main(String[] args) {
        Arrays.stream(Test.class.getAnnotations()).forEach( a ->{
            Custom custom = (Custom) a;
            System.out.println(custom.name());
            System.out.println(custom.age());
        });
    }
}
