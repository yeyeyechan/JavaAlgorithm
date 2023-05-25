import java.nio.BufferUnderflowException;

public class IntQueue {
    private int[] que;
    private int num ;
    private int capacity;
    private int front;
    private int rear;

    public class EmptyIntQueueException extends RuntimeException{
         public EmptyIntQueueException(){

        }
    }
    public class OverFlowIntQueueException extends  RuntimeException{
        public OverFlowIntQueueException(){

        }
    }
    public IntQueue(int capacity) {
        num = front = rear = 0;
        capacity =capacity;
        try{
            que = new int[capacity];
        }catch(OutOfMemoryError e){
            capacity = 0 ;
        }
    }
    public int enque (int x) throws OverFlowIntQueueException{
        if(num >= capacity)
            throw new OverFlowIntQueueException();
        que[rear++] = x;
        num++;
        if(rear == capacity){
            rear = 0;
        }
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (num <=0)
            throw new EmptyIntQueueException();
        int result = que[front++];
        num--;
        if(front == capacity){
            front = 0 ;
        }
        return result;

    }

    public int peek() throws EmptyIntQueueException {
        if( num <= capacity)
            throw new EmptyIntQueueException();
        int result = que[front] ;

        return result;
    }
    public void clear(){
        num = front = rear = 0;
    }

    public int indexOf(int x) {
        for(int i =0 ; i < num ; i ++){
            int index = (i+front)% capacity;

            if(que[index] == x)
                return index;
        }
        return -1;
    }
    public int size(){
        return num;
    }
    public int getCapacity(){
        return capacity;
    }
    public boolean isEmpty(){
        return num <=0;
    }
    public boolean isFull(){
        return num >=capacity;
    }
    public int search(int x){
        for(int i = 0 ; i < num ; i++){
            int index = (front + i)%capacity;
            if(que[index] == x)
                return i+1;
        }
        return 0;

    }
    public void dump(){
        for(int i =0 ; i < num ; i++){
            int index = (i+front)%capacity;
            System.out.print(que[index]);
        }
    }
}
