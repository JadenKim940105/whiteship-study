package weeks6.methodoverroding;

public class Main {
    static class Parent{
        public void print(){
            System.out.println("this is parent method");
        }
    }
    static class Child extends Parent{
        public void print(){
            System.out.println("this is child method");
        }
    }
    static class WithOutOverridingChild extends Parent{

    }

    public static void main(String[] args) {
        Child child = new Child();
        child.print();

        WithOutOverridingChild child2 = new WithOutOverridingChild();
        child2.print();
    }
}
