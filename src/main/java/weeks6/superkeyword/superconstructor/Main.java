package weeks6.superkeyword.superconstructor;

public class Main {

    static class Parent{
        String str;
        Parent(String param){
            str = param;
        }
    }

    static class Child extends Parent{
        int a;
        Child(String param){
            super(param);
            a = 10;
        }
    }

    public static void main(String[] args) {
        Child child = new Child("parent");
        System.out.println(child.str);
        System.out.println(child.a);

    }

}
