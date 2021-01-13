package weeks9;

public class Throws {
    public static void main(String[] args) throws Exception {
            test();
    }

    private static void test() throws Exception{
        System.out.println("이 메소드는 내부적으로 exception 이 발생할 수 있음");
        throw new Exception("예외!");
    }
}
