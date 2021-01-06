package weeks8;

public class SamsungTv implements Tv {
    @Override
    public void turnOnTv() {
        System.out.println("삼성Tv 전원 키기");
    }

    @Override
    public void turnOffTv() {
        System.out.println("삼성Tv 전원 끄기");
    }

    public void samsungService(){
        System.out.println("삼성 서비스");
    }
}
