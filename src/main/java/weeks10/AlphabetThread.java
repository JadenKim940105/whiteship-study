package weeks10;

public class AlphabetThread implements Runnable {
    @Override
    public void run() {
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
