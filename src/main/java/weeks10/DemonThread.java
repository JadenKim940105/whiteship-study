package weeks10;

public class DemonThread {
    public static void main(String[] args) {

        Thread demonThread = new Thread(() -> {
            for(int i = 0 ; i < 5; i++){
                System.out.println("데몬 쓰레드 ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        demonThread.setDaemon(true);
        demonThread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인쓰레드 종료");

    }
}
