package weeks8;

public class JadenPhone implements Phone, Tv, Camera {
    @Override
    public void takePhoto() {
        System.out.println("사진 찰칵");
    }

    @Override
    public void call() {
        System.out.println("전화 따르릉");
    }

    @Override
    public void turnOnTv() {
        System.out.println("티비 시청");
    }

    @Override
    public void turnOffTv() {
        System.out.println("티비 종료");
    }

}
