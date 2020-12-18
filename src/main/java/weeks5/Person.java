package weeks5;

import java.util.Calendar;

public class Person {

    String name;

    int age;

    float height;

    Person friend;

    public Person() {

    }
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age, float height, Person friend) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.friend = friend;
    }

    // 이름을 변경하고 변경된 이름을 return 하는 메서드
    public String changeName(String name){
        this.name = name;
        return name;
    }

    // 현재 Person 의 각각의 변수에 저장된 값들을 콘솔에 출력해주는 메서드
    public void showPersonInfo(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("height : " + height);
        if(friend != null ){
            System.out.println("friend : " + friend.name);
        }
    }

    // 태어난 년도를 return 하는 메서드
    public int birthYaer(){
        return Calendar.getInstance().get(Calendar.YEAR)-age;
    }

}
