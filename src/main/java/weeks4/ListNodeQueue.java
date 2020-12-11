package weeks4;

public class ListNodeQueue {

    ListNode listNode = new ListNode();

    private int front = 0;

    ListNode.Node beforeNode;
    ListNode.Node currentNode;


    public void enque(int data){
        ListNode.Node newNode = new ListNode.Node(data);
        front = 1;
        if (listNode.head == null){
            listNode.head = newNode;
            currentNode = newNode;
            return;
        } else {
            ListNode.Node crrNode = listNode.head;
            while (crrNode.nextNode != null){
                crrNode = crrNode.nextNode;
                front ++;
            }
            beforeNode = crrNode;
            crrNode.nextNode = newNode;
            currentNode = newNode;
            front ++;
        }
    }

    public int deque() throws IndexOutOfBoundsException{
        if (front != 0 ){
            front --;
            int retVal = currentNode.data;
            currentNode = beforeNode;
            if (currentNode == null){
                listNode.head = null;
            }
            if(front == 0 )
                listNode.head = null;
            return retVal;
        } else{
           throw new IndexOutOfBoundsException("queue 가 비어있습니다");
        }
    }


    public int getFront() {
        return front;
    }
}
