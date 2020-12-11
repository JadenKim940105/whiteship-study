package weeks4;

public class IfStatement {

    public static void main(String[] args) {

        int number = 33;

        if ( number % 2 == 1){
            System.out.println("number 은 홀수 입니다.");
        } else if (number % 3 == 0){
            System.out.println("number 은 3의 배수 입니다.");
        } else {
            System.out.println("모든 조건식이 false 입니다. ");
        }

        System.out.println("=======================");

        number = 36;

        if ( number % 2 == 1){
            System.out.println("number 은 홀수 입니다.");
        } else if (number % 3 == 0){
            System.out.println("number 은 3의 배수 입니다.");
        } else {
            System.out.println("모든 조건식이 false 입니다. ");
        }

        System.out.println("=======================");

        number = 40;

        if ( number % 2 == 1){
            System.out.println("number 은 홀수 입니다.");
        } else if (number % 3 == 0){
            System.out.println("number 은 3의 배수 입니다.");
        } else {
            System.out.println("모든 조건식이 false 입니다. ");
        }

    }
}
