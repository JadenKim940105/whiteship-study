package weeks6.Inheritance.hierachical;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.print();
        c.print();
        System.out.println(c instanceof Object);
    }
}
