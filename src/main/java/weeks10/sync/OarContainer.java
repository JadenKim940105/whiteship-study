package weeks10.sync;

public class OarContainer {
    private int numberOfOar = 1;

    public synchronized int getOar() {
        if (numberOfOar >= 0 ){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberOfOar -= 1;
        }
        return numberOfOar+1;
    }

    public void returnOar(){
        numberOfOar += 1;
    }
}
