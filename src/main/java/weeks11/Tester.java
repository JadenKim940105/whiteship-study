package weeks11;

public class Tester {
    public static void main(String[] args) {

        LoLChampionShip 한국오픈여름시즌롤챔피언십 = new LoLChampionShip();
        한국오픈여름시즌롤챔피언십.setSeason(Season.SUMMER);
        한국오픈여름시즌롤챔피언십.setSeason2(Season2.SUMMER);
        한국오픈여름시즌롤챔피언십.setRegion(Region.KOREA);
        한국오픈여름시즌롤챔피언십.setRegion2(Region2.KOREA);

        LoLChampionShip 북미오픈여름시즌롤챔피언십 = new LoLChampionShip();
        북미오픈여름시즌롤챔피언십.setSeason(Season.SUMMER);
        북미오픈여름시즌롤챔피언십.setSeason2(Season2.SUMMER);
        북미오픈여름시즌롤챔피언십.setRegion(Region.NORTHAMERICA);
        북미오픈여름시즌롤챔피언십.setRegion2(Region2.NORTHAMERICA);


        System.out.println(북미오픈여름시즌롤챔피언십.getSeason2() == 북미오픈여름시즌롤챔피언십.getRegion2());
        // System.out.println(북미오픈여름시즌롤챔피언십.getSeason() == 북미오픈여름시즌롤챔피언십.getRegion());

    }
}
