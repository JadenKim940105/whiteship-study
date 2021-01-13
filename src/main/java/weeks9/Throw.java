package weeks9;

public class Throw {
    public static void main(String[] args) {
        try{
            System.out.println("예외를 발생시켜보자");
            throw new Exception("!생성한 예외!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
