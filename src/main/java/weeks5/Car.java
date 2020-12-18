package weeks5;

public class Car {

    public static String classVar = "클래스 변수";

    String color;

    int price;


    public Car(){ }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int price){
        this(color);
        this.price = price;
    }


    public void getCarInfo(){
        System.out.println(this.color);
        System.out.println(this.price);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getClassVar() {
        return classVar;
    }

    public static void setClassVar(String classVar) {
        Car.classVar = classVar;
    }

    public static void aboutCarClass(){
        System.out.println("차와 관련된 class");
    }

    public Car returnThis(){
        return this;
    }
}
