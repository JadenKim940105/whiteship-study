package weeks5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    @DisplayName("기본 생성자를 사용한 초기화")
    void defaultConstruct(){
        Person person = new Person();
        assertThat(person.name).isEqualTo(null);
        assertThat(person.age).isEqualTo(0);
        assertThat(person.height).isEqualTo(0.0f);
        assertThat(person.friend).isEqualTo(null);
    }

    @Test
    @DisplayName("생성자를 사용한 초기화")
    void construct(){
        Person son = new Person("Son", 28, 183f);

        Person messi = new Person("Messi", 33, 168.8f, son);

        assertThat(messi.name).isEqualTo("Messi");
        assertThat(messi.age).isEqualTo(33);
        assertThat(messi.height).isEqualTo(168.8f);
        assertThat(messi.friend).isEqualTo(son);

        son.birthYaer();
    }


    @Test
    @DisplayName("changeName 메서드 테스트")
    void chageName(){
        Person messi = createPerson_messi();

        String changedName = messi.changeName("ronaldo");

        assertThat(changedName).isEqualTo("ronaldo");
        assertThat(messi.name).isEqualTo("ronaldo");
    }

    @Test
    @DisplayName("showPersonInfo 메서드 테스트")
    void showPersonInfo(){
        Person messi = createPerson_messi();
        messi.showPersonInfo();
    }

    @Test
    @DisplayName("birthYaer 메서드 테스트")
    void birthYaer(){
        Person messi = createPerson_messi();
        assertThat(messi.birthYaer()).isEqualTo(1987);
    }

    private Person createPerson_messi() {
        return new Person("messi", 33 , 168.8f);
    }

    @Test
    @DisplayName("기본생성자 및 다양한 생성자")
    void consTest(){
        Person person = new Person();
        assertThat(person.name).isEqualTo(null);
        assertThat(person.age).isEqualTo(0);
        assertThat(person.height).isEqualTo(0.0f);
        assertThat(person.friend).isEqualTo(null);

        Person person1 = new Person("jaden");
        assertThat(person1.name).isEqualTo("jaden");
        assertThat(person1.age).isEqualTo(0);
        assertThat(person1.height).isEqualTo(0.0f);
        assertThat(person1.friend).isEqualTo(null);

        Person person2 = new Person("kim", 10, 180.0f, person1);
        assertThat(person2.name).isEqualTo("kim");
        assertThat(person2.age).isEqualTo(10);
        assertThat(person2.height).isEqualTo(180.0f);
        assertThat(person2.friend).isEqualTo(person1);
    }
}