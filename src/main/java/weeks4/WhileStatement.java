package weeks4;

import java.util.Scanner;

public class WhileStatement  {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int doOrNot;
        do{
            System.out.print("0 혹은 1을 입력하세요 : ");
            doOrNot = sc.nextInt();

        } while (doOrNot != 0  && doOrNot != 1);
    }
}
