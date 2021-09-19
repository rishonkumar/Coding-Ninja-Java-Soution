package Queue;

public class QueueUse {

    public static void main(String[] args) {

        QueueUsingArray queue = new QueueUsingArray();
        int arr[] = {10,20,30,40};
        for(int elem : arr){
            try {
                queue.enqueue(elem);
            }
            catch (QueueFullException e){

            }

        }
        while (!queue.isEmpty()){
            try{
                System.out.println(queue.dequeue());
            }catch (QueueEmptyException e){
                //will never reach here
            }
        }

    }
}
