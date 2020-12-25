package weeks6.abstractclass;

public class Main {
    public static void main(String[] args) {

        Car hCar = new HyndaiCar();
        Car kCar = new KiaCar();

        hCar.start();   // -> Hyndai car start
        hCar.go();      // -> Hyndai car go
        hCar.stop();    // -> Hyndai car stop

        kCar.start();   // -> KiaCar car start
        kCar.go();      // -> KiaCar car go
        kCar.stop();    // -> KiaCar car stop


    }
}
