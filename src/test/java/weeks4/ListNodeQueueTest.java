package weeks4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ListNodeQueueTest {

    @Test
    void listNodeQueueTest() {
        ListNodeQueue listNodeQueue = new ListNodeQueue();

        listNodeQueue.enque(1);
        // queue : 1
        assertThat(listNodeQueue.listNode.head.data).isEqualTo(1);
        assertThat(listNodeQueue.listNode.head.nextNode).isNull();
        assertThat(listNodeQueue.getFront()).isEqualTo(1);

        listNodeQueue.enque(3);
        // queue : 1 3
        assertThat(listNodeQueue.listNode.head.data).isEqualTo(1);
        assertThat(listNodeQueue.listNode.head.nextNode.data).isEqualTo(3);
        assertThat(listNodeQueue.listNode.head.nextNode.nextNode).isNull();
        assertThat(listNodeQueue.getFront()).isEqualTo(2);


        listNodeQueue.enque(6);
        // queue : 1 3 6
        assertThat(listNodeQueue.listNode.head.data).isEqualTo(1);
        assertThat(listNodeQueue.listNode.head.nextNode.data).isEqualTo(3);
        assertThat(listNodeQueue.listNode.head.nextNode.nextNode.data).isEqualTo(6);
        assertThat(listNodeQueue.listNode.head.nextNode.nextNode.nextNode).isNull();
        assertThat(listNodeQueue.getFront()).isEqualTo(3);
    }

    @Test
    void dequeu(){
        ListNodeQueue listNodeQueue = new ListNodeQueue();
        listNodeQueue.enque(1);
        // queue : 1


        int retVal = listNodeQueue.deque();
        // queue :
        assertThat(retVal).isEqualTo(1);

        assertThrows(IndexOutOfBoundsException.class, ()->{
           listNodeQueue.deque();
        });

        listNodeQueue.enque(3);
        // queue : 3
        assertThat(listNodeQueue.listNode.head.data).isEqualTo(3);

        listNodeQueue.enque(4);
        // queue : 3 4
        assertThat(listNodeQueue.listNode.head.data).isEqualTo(3);
        assertThat(listNodeQueue.listNode.head.nextNode.data).isEqualTo(4);

        retVal = listNodeQueue.deque();
        // queue : 3
        assertThat(retVal).isEqualTo(4);

        assertThat(listNodeQueue.currentNode.data).isEqualTo(3);

        retVal = listNodeQueue.deque();
        // queue :
        assertThat(retVal).isEqualTo(3);
        assertThat(listNodeQueue.listNode.head).isNull();

        assertThrows(IndexOutOfBoundsException.class, ()->{
            listNodeQueue.deque();
        });



    }
}