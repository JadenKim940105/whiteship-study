package weeks4;
/*
Stack 을 구현하세요.
int 배열을 사용해서 정수를 저장하는 Stack 을 구현하세요.
void push(int data)를 구현하세요.
int pop()을 구현하세요.

 */

public class ArrStack {

    Integer arr[] = new Integer[100];

    private int topPosition = 0;

    public void push(int data){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == null){
                arr[i] = data;
                topPosition = i;
                break;
            }
        }
    }

    public int pop() throws IllegalArgumentException{
        if (topPosition == -1){
            throw new IllegalArgumentException(" 비어있는 stack 입니다. ");
        } else {
            int returnVal = arr[topPosition];
            arr[topPosition] = null;
            topPosition--;
            return returnVal;
        }
    }


}
