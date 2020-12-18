package weeks5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {


    @Test
    @DisplayName("인스턴스 변수")
    void instanceVar(){

        Car car = new Car();
        car.color = "red";
        car.price = 10000;

        Car car2 = new Car("blue", 9999);

        Car car3 = new Car();
        car3.setColor("green");
        car3.setPrice(1);

        assertThat(car.color).isEqualTo("red");
        assertThat(car.price).isEqualTo(10000);

        assertThat(car2.color).isEqualTo("blue");
        assertThat(car2.price).isEqualTo(9999);

        assertThat(car3.getColor()).isEqualTo("green");
        assertThat(car3.getPrice()).isEqualTo(1);
    }

    @Test
    @DisplayName("클래스 변수")
    void staticVar(){
        assertThat(Car.classVar).isEqualTo("클래스 변수");

        Car.classVar = "클래스 변수에 직접 값을 할당";
        assertThat(Car.classVar).isEqualTo("클래스 변수에 직접 값을 할당");

        Car.setClassVar("클래스 변수에 static 메서드를 통해 값을 할당");
        assertThat(Car.classVar).isEqualTo("클래스 변수에 static 메서드를 통해 값을 할당");
    }

    @Test
    @DisplayName("인스턴스 메서드")
    void instanceMethod(){
        Car car = new Car("Red", 100);
        car.getCarInfo();   // 호출하기 위해선 인스턴스가 필요하다.
    }

    @Test
    @DisplayName("클래스 메서드")
    void staticMethod(){
        Car.aboutCarClass();
    }

    @Test
    @DisplayName("this 테스트")
    void returnThis(){
        Car car = new Car("Blue", 100);
        Car car1 = car.returnThis();

        assertThat(car).isEqualTo(car1);
    }


}