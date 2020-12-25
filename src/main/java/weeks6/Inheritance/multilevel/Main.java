package weeks6.Inheritance.multilevel;

public class Main {
    public static void main(String[] args) {
        A grandParent = new A();
        grandParent.grandParent();

        B parent = new B();
        parent.grandParent();
        parent.parent();

        C child = new C();
        child.grandParent();
        child.parent();
        child.child();
    }
}
