package weeks12;

import java.util.Arrays;

public class SubTest extends Test {
    public static void main(String[] args) {
        Arrays.stream(SubTest.class.getAnnotations()).forEach(System.out::println);
    }
}
