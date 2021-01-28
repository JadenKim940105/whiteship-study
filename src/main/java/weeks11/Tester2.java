package weeks11;

public class Tester2 {
    public static void main(String[] args) {

        Season[] values = Season.values();
        for(Season v : values){
            System.out.println(v + " " + v.ordinal());
        }
        System.out.println();

        Season season = Season.valueOf("WINTER");
        System.out.println(season);

        Region region = Region.valueOf("KOREA");
        System.out.println(region);





    }
}
