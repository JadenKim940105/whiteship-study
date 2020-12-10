package weeks4;

// todo : Array 를 활용하여 queue 구현
public class ArrQueue {

    Integer queue[] = new Integer[100];
    private int front = 0;


    public void enque(int data){
        queue[front] = data;
        front++;
    }

    public int deque() throws IllegalArgumentException{
        if (front == 0 ){
           throw new IllegalArgumentException(" queue가 비어있습니다. ");
        }
        int retVal = queue[front-1];
        front--;
        return retVal;
    }

    public int getFront() {
        return front;
    }
}

