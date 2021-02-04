package weeks12;

@Name("This is name")
public class Tester {

    public static void main(String[] args) {
        Name annotation = Tester.class.getAnnotation(Name.class);
        System.out.println(annotation.value());
    }

}
