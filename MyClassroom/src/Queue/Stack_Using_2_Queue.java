package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_2_Queue {

    public Queue<Integer> q1;
    public Queue<Integer> q2;

    public Stack_Using_2_Queue(){

        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();

    }

    public int getSize(){

        return this.q1.size();
    }

    public boolean isEmpty(){
        return this.getSize()==0;
    }

    public void push(int element){
        this.q1.add(element);
    }

    public int pop(){
        if(this.isEmpty()) return -1;

        while(this.q1.size()>1){
            this.q2.add(this.q1.poll());
        }
        int ans = this.q1.poll();

        Queue<Integer> temp = this.q1;
        this.q1= this.q2;
        this.q2 = temp;

        return ans;
    }

    public int top(){
        if(this.isEmpty()) return -1;

        while(this.q1.size()>1){
            this.q2.add(this.q1.poll());
        }
        int ans = q1.poll();
        q2.add(ans);

        Queue<Integer> temp = this.q1;
        this.q1 = this.q2;
        this.q2 = temp;

        return ans;
    }
}
