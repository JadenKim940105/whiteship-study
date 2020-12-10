package weeks4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrQueueTest {

    @Test
    void arrQueue(){
        ArrQueue arrQueue = new ArrQueue();

        arrQueue.enque(1);
        // queue : 1
        assertThat(arrQueue.queue[0]).isEqualTo(1);
        assertThat(arrQueue.queue[1]).isNull();

        arrQueue.enque(2);
        // queue : 1 2
        assertThat(arrQueue.queue[0]).isEqualTo(1);
        assertThat(arrQueue.queue[1]).isEqualTo(2);
        assertThat(arrQueue.queue[2]).isNull();

        int retVal = arrQueue.deque();
        // queue : 1
        assertThat(retVal).isEqualTo(2);
        assertThat(arrQueue.queue[0]).isEqualTo(1);
        assertThat(arrQueue.getFront()).isEqualTo(1);

        arrQueue.enque(5);
        // queue : 1 5
        assertThat(arrQueue.queue[0]).isEqualTo(1);
        assertThat(arrQueue.queue[1]).isEqualTo(5);

        retVal = arrQueue.deque();
        // queue : 1
        assertThat(retVal).isEqualTo(5);
        assertThat(arrQueue.queue[0]).isEqualTo(1);

        retVal = arrQueue.deque();
        // queue :
        assertThat(retVal).isEqualTo(1);
        assertThat(arrQueue.getFront()).isEqualTo(0);

        assertThrows(IllegalArgumentException.class, ()->{
            arrQueue.deque();
        });

    }

}