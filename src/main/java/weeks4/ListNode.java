package weeks4;
/*
LinkedList 에 대해 공부하세요.
정수를 저장하는 ListNode 클래스를 구현하세요.
ListNode add(ListNode head, ListNode nodeToAdd, int position)를 구현하세요.
ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
boolean contains(ListNode head, ListNode nodeToCheck)를 구현하세요.
 */

public class ListNode {

    Node head;

    public ListNode() {
        this.head = null;
    }

    public ListNode(Node head) {
        this.head = head;
    }

    static class Node{
        Integer data;
        Node nextNode;

        public Node() {
            data = null;
            nextNode = null;
        }

        public Node(int data) {
            this.data = data;
            nextNode = null;
        }
    }

    public ListNode add(int data){
        Node node = new Node(data);
        node.nextNode = null;

        if( this.head == null){
            this.head = node;
            return this;
        }

        Node lastNode = this.head;

        while (lastNode.nextNode != null){
            lastNode = lastNode.nextNode;
        }
        lastNode.nextNode = node;

        return this;
    }

    // ListNode add(ListNode head, ListNode nodeToAdd, int position)를 구현하세요.
    public ListNode add(Node nodeToAdd, int position) throws IllegalArgumentException{
        if ( position < 0 ){
            throw new IllegalArgumentException(" check out the position ");
        } else if (position == 0){
            Node crrNode = this.head;
            head = nodeToAdd;
            nodeToAdd.nextNode= crrNode;
            return this;
        }
        Node crrNode = this.head;
        Node beforeNode = null;

        while ( position-- > 0 ){
            beforeNode = crrNode;
            crrNode = crrNode.nextNode;
            if(crrNode == null && position > 0){
                throw new IllegalArgumentException(" the position is greater than ListNode size : " + this.getSize());
            }
        }
        beforeNode.nextNode = nodeToAdd;
        nodeToAdd.nextNode = crrNode;

        return this;
    }

    // ListNode remove(ListNode head, int positionToRemove)를 구현하세요.
    public Node remove(int positionToRemove) throws IllegalArgumentException{
        if ( positionToRemove < 0 ){
            throw new IllegalArgumentException(" check out the position ");
        } else if ( positionToRemove == 0){
            if( this.head != null){
                if (this.head.nextNode != null){
                    this.head = this.head.nextNode;
                    return this.head;
                }
                Node returnNode = this.head;
                this.head = null;
                return returnNode;
            }
        }

        Node beforeNode = null;
        Node crrNode = this.head;
        while (positionToRemove -- > 0){
            beforeNode = crrNode;
            crrNode = crrNode.nextNode;
            if (crrNode == null &&  positionToRemove >= 0 ){
                throw new IllegalArgumentException(" The position is grater than ListNode size : " + this.getSize());
            }
        }
        Node nextNode = crrNode.nextNode;
        if (nextNode == null){
            beforeNode.nextNode = null;
        } else {
            beforeNode.nextNode = nextNode;
        }
        return crrNode;
    }

    // boolean contains(ListNode head, ListNode nodeToCheck)
    public boolean contains(Node nodeToCheck){
        int checkVal = nodeToCheck.data;
        if(this.head.data == checkVal)
            return true;
        Node crrNode = this.head;
        while ( crrNode.nextNode != null ){
            crrNode = crrNode.nextNode;
            if(crrNode.data == checkVal){
                return true;
            }
        }
        return false;
    }


    public int getSize(){
        int cnt = 0;
        Node crr = this.head;
        cnt ++; // head 가 있다는 것은 size 가 1 이란 것
        while (crr.nextNode != null ){
            cnt++;
            crr = crr.nextNode;
        }
        return cnt;
    }

    public void showListNode(){
        ListNode.Node currentNode = this.head;
        System.out.print("ListNode : ");
        while (currentNode.nextNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
        System.out.println(currentNode.data);
    }

}
