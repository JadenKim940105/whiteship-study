package weeks8;

public class LgTv implements Tv{
    @Override
    public void turnOnTv() {
        System.out.println("엘지tv 전원 킴");
    }

    @Override
    public void turnOffTv() {
        System.out.println("엘지tv 전원 끔");
    }
}
