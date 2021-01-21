package weeks10;

public class JoinTester {
    public static void main(String[] args) throws InterruptedException {
        Thread movie = new Thread(new MovieClient());
        System.out.println("영화 상영 버튼 누르기");
        movie.start();
        movie.join();
        System.out.println("영화 종료 버튼 누르기");
    }
}

class MovieClient implements Runnable{
    @Override
    public void run() {
        watchingMovie();
    }

    public void watchingMovie(){
        System.out.println("영화시청 시작");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("영화시청 종료");
    }
}