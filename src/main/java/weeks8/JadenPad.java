package weeks8;

public class JadenPad implements Tv, Camera{
    @Override
    public void takePhoto() {
        System.out.println("사진 찰칵");
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
