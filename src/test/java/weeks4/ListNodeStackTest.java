package weeks4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    @Test
    void listNodeStackTest() {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(1);
        // stack : 1
        assertThat(listNodeStack.listNode.head.data).isEqualTo(1);
        assertThat(listNodeStack.listNode.head.nextNode).isNull();
        assertThat(listNodeStack.topPosition).isEqualTo(0);

        listNodeStack.push(2);
        // stack : 1 - 2
        assertThat(listNodeStack.listNode.head.nextNode.data).isEqualTo(2);
        assertThat(listNodeStack.listNode.head.nextNode.nextNode).isNull();
        assertThat(listNodeStack.topPosition).isEqualTo(1);
        int val = listNodeStack.pop();
        assertThat(val).isEqualTo(2);
        // stack : 1
        assertThat(listNodeStack.topPosition).isEqualTo(0);
        assertThat(listNodeStack.listNode.head.nextNode).isNull();
        assertThat(listNodeStack.listNode.head.data).isEqualTo(1);
        listNodeStack.push(2);
        // stack : 1 - 2
        assertThat(listNodeStack.topPosition).isEqualTo(1);
        assertThat(listNodeStack.listNode.head.data).isEqualTo(1);
        assertThat(listNodeStack.listNode.head.nextNode.data).isEqualTo(2);
        assertThat(listNodeStack.listNode.head.nextNode.nextNode).isNull();
        listNodeStack.push(3);
        // stack : 1 - 2 - 3
        assertThat(listNodeStack.topPosition).isEqualTo(2);
        assertThat(listNodeStack.listNode.head.data).isEqualTo(1);
        assertThat(listNodeStack.listNode.head.nextNode.data).isEqualTo(2);
        assertThat(listNodeStack.listNode.head.nextNode.nextNode.data).isEqualTo(3);
        val = listNodeStack.pop();
        assertThat(val).isEqualTo(3);
        // stack : 1 - 2
        assertThat(listNodeStack.topPosition).isEqualTo(1);
        assertThat(listNodeStack.listNode.head.data).isEqualTo(1);
        assertThat(listNodeStack.listNode.head.nextNode.data).isEqualTo(2);
        assertThat(listNodeStack.listNode.head.nextNode.nextNode).isNull();
        val = listNodeStack.pop();
        assertThat(val).isEqualTo(2);
        // stack : 1
        assertThat(listNodeStack.topPosition).isEqualTo(0);
        assertThat(listNodeStack.listNode.head.nextNode).isNull();
        assertThat(listNodeStack.listNode.head.data).isEqualTo(1);
        val = listNodeStack.pop();
        assertThat(val).isEqualTo(1);
        // stack :
        assertThat(listNodeStack.topPosition).isEqualTo(-1);
        assertThat(listNodeStack.listNode.head).isNull();

        // 빈 스택에서 pop 할 시 exception
        assertThrows(IllegalArgumentException.class, ()->{
           listNodeStack.pop();
        });
    }
}