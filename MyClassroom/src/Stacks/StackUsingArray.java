package Stacks;

public class StackUsingArray {

    private int data[]; //private coz no can change the data
    private int topIndex; //index of top element of the stack
    public StackUsingArray(){
        data = new int[10];
        topIndex=-1;
    }

    //if user want to enter the size
    public StackUsingArray(int size){
        data = new int[size];
        topIndex = -1;
    }

    //O(1)
    public int size(){
        return topIndex+1;
    }

    //O(1)
    public boolean isEmpty(){
//        if(topIndex==-1) return true;
//        else return false;
        return topIndex == -1;
    }
    // O(1)
    public void push(int element) throws StackFullException {
        //If Stack is full
        if(topIndex == data.length-1) {
//            StackFullException e = new StackFullException();
//            throw e;
            throw new StackFullException();
            //Throw exception
        }
        //topIndex++;
        data[++topIndex]=element;
    }

    //O(1)
    public int top() throws StackEmptyException {
        if(topIndex==-1) {
            //Throw StackEmptyException
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    //O(1)
    public int pop() throws StackEmptyException {
        if(topIndex==-1) {
            //Throw StackEmptyException
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
}
