package weeks8;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Camera.cameraInfo();

        Phone jadenPhone = new JadenPhone();
        jadenPhone.call();

        JadenPhone jadenPhone1 = new JadenPhone();
        jadenPhone1.takeVideo();



        Tv samsungTv = new SamsungTv();

        Tv lgTv = new LgTv();

        ArrayList<Tv> tvList = new ArrayList<>();
        tvList.add(samsungTv);
        tvList.add(lgTv);

        SamsungTv sTv = (SamsungTv) tvList.get(0);
        sTv.samsungService();

    }

}
