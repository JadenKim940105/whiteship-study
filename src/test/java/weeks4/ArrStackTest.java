package weeks4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrStackTest {

    @Test
    void arrStack() {
        ArrStack arrStack = new ArrStack();
        System.out.println(arrStack.arr[0]);
    }

    @Test
    void arrStackPush() {

        ArrStack arrStack = new ArrStack();
        arrStack.push(3);

        assertThat(arrStack.arr[0]).isEqualTo(3);
        assertThat(arrStack.arr[1]).isNull();
    }

    @Test
    void arrStackPop() {

        ArrStack arrStack = new ArrStack();
        arrStack.push(3);

        assertThat(arrStack.arr[0]).isEqualTo(3);
        assertThat(arrStack.arr[1]).isNull();

        arrStack.push(4);
        assertThat(arrStack.arr[1]).isEqualTo(4);

        arrStack.pop();
        assertThat(arrStack.arr[1]).isEqualTo(null);
        arrStack.pop();
        assertThat(arrStack.arr[0]).isEqualTo(null);
        assertThrows(IllegalArgumentException.class, ()->{
            arrStack.pop();
        });
        arrStack.push(10);
        assertThat(arrStack.arr[0]).isEqualTo(10);

    }
}