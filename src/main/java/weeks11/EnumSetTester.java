package weeks11;

import java.util.EnumSet;

public class EnumSetTester {
    public static void main(String[] args) {
        //allOf(enum type) -> 인자로 받은 열거형의 모든 상수를 받는다.
        EnumSet<Season> seasonEnumSet = EnumSet.allOf(Season.class);
        System.out.println(seasonEnumSet.size());
        seasonEnumSet.forEach(System.out::println);
        System.out.println();
        //copOf(enumset) -> 인자로 받은 enumset 이 가지고 있는 값들을 모두 받는다.
        EnumSet<Season> copySeasonEnumSet = EnumSet.copyOf(seasonEnumSet);
        seasonEnumSet.forEach(System.out::println);
        System.out.println();
        //of(e, e1) -> 인자로 받은 상수들만 받는다.
        EnumSet<Region> regionEnumSet = EnumSet.of(Region.KOREA, Region.CHINA);
        regionEnumSet.forEach(System.out::println);
        System.out.println();
        //complementOf(enumset) -> 인자로 받은 enumset 이 포함하지 않는 enum 의 상수들만 받는다.
        EnumSet<Region> regionEnumSet1 = EnumSet.complementOf(regionEnumSet);
        regionEnumSet1.forEach(System.out::println);
        System.out.println();

    }
}
