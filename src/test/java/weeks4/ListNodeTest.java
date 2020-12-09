package weeks4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ListNodeTest {

    @Test
    void test() {
        ListNode listNode = new ListNode();
        listNode.add(1);
        assertThat(listNode.head.data).isEqualTo(1);
        listNode.add(2);
        assertThat(listNode.head.nextNode.data).isEqualTo(2);
        listNode.showListNode();
        assertThat(listNode.getSize()).isEqualTo(2);
        listNode.add(3);
        assertThat(listNode.getSize()).isEqualTo(3);

        ListNode.Node newNode = new ListNode.Node(5);

        listNode.add(newNode, 0);
        listNode.showListNode();
        listNode.remove(1);
        listNode.showListNode();
        listNode.remove(0);
        listNode.remove(8);
        assertThat(listNode.getSize()).isEqualTo(2);
        assertThat(listNode.head.data).isEqualTo(2);







    }
}