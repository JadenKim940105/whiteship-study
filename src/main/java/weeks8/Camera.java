package weeks8;

public interface Camera {

    void takePhoto();

    default void takeVideo(){
        System.out.println("비디오 촬영");
    }

    static void cameraInfo(){
        showInfo();
    }

    private static void showInfo(){
        System.out.println("카메라다");
    }

}
