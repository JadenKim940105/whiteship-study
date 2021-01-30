package weeks11;

public class EnumExample {

    enum Fruit {
        BANANA("바나나난 노랗고 맛있다"), APPLE("사과는 빨갛고 맛있다"), KIWI("키워는 초록하고 맛있다.");

        String description;

        Fruit(String description){
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        System.out.println(Fruit.BANANA.getDescription());
    }
}
