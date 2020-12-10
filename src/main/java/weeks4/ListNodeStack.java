package weeks4;

/*
과제 4. 앞서 만든 ListNode 를 사용해서 Stack 을 구현하세요.
ListNode head 를 가지고 있는 ListNodeStack 클래스를 구현하세요.
void push(int data)를 구현하세요.
int pop()을 구현하세요.
 */

public class ListNodeStack {

    ListNode listNode = new ListNode();

    public int topPosition = -1;


    public void push(int data){
        ListNode.Node newNode = new ListNode.Node(data);

        if (this.listNode.head == null){
            this.listNode.head = newNode;
            topPosition = 0;
        } else{
            ListNode.Node crrNode = this.listNode.head;
            topPosition = 1;
            while (crrNode.nextNode != null){
                crrNode = crrNode.nextNode;
                topPosition ++;
            }
            crrNode.nextNode = newNode;
        }
    }

    public int pop(){
        ListNode.Node remove = listNode.remove(topPosition);
        if(topPosition > -1 ){
            topPosition --;
        }
        return remove.data;
    }

}
