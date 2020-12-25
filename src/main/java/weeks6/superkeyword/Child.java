package weeks6.superkeyword;

public class Child extends Parent {

    String str = "child";

    void printStr(){
        System.out.println(str);
    }

    void  printStrWithSuper(){
        System.out.println(super.str);
    }

    public static void main(String[] args) {

        Child child = new Child();
        child.printStr();
        child.printStrWithSuper();

    }
}
