package weeks10.sync;

public class WhiteShip {

    public static void main(String[] args) {

        OarContainer oarContainer = new OarContainer();

        for(int i = 0 ; i < 10; i ++ ){
            Thread sailor = new Thread(new Runnable() {
                @Override
                public void run() {
                    if(oarContainer.getOar() == 1){
                        System.out.println("노로 노를 젓는다.");
                        oarContainer.returnOar();
                    } else {
                        System.out.println("노도 없는데 손으로 노를 젓는다.. ㅠㅠ");
                    }
                }
            });
            sailor.start();
        }
    }
}
