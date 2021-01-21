package weeks10;

public class SingleThread {
    public static void main(String[] args) {

        System.out.println(" 메인 스레드 실행흐름 ");

        for(int i = 0 ; i < 3; i++){
            System.out.println("Hello Thread");
            switch (i){
                case 1 :
                    System.out.println("Second loop");
                    break;
            }
        }
        int a = 1;

        if( a != 1 ){
            System.out.println("Skip");
        } else {
            System.out.println("Do");
        }
    }
    /*
        에인 스레드 실행흐름
        Hello Thread
        Hello Thread
        Second loop
        Hello Thread
        Do
     */
}
