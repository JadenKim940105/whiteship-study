package weeks9;

public class Tester {
    public static void main(String[] args) {
        try{
            throw new CustomException("커스텀 예외");
        } catch (CustomException e){
            e.printStackTrace();
        }
    }
}
