package weeks9;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(3/0);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("IndexOutOfBoundsException 혹은  ArithmeticException 발생할 경우 수행");
        }


        try {
            System.out.println(3/1);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("반드시 수행");
        }

    }
}
