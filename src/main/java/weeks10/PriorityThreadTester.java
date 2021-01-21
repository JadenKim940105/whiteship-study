package weeks10;

public class PriorityThreadTester {

    private static void task(){
        for (int i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName() + " 우선순위  : " + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
           task();
        });

        Thread thread2 = new Thread(()->{
           task();
        });

        thread1.setName("+ 스레드");
        thread2.setName("- 스레드");
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread1.start();
    }
}
