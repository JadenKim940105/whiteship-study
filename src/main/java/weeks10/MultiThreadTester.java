package weeks10;

public class MultiThreadTester {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " start ");

        Thread digitThread = new NumberThread();
        Thread alphaThread = new Thread(new AlphabetThread());

        digitThread.start();
        alphaThread.start();


        System.out.println(Thread.currentThread().getName() + " end ");
    }
}
