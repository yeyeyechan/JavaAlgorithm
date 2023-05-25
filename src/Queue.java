public class Queue <E>{
    private E[] que;
    private int num;
    private int capacity;
    private int front;
    private int rear;

    public static class EmptyQueueException extends RuntimeException{
        public EmptyQueueException(){}
    }
    public static class OverflowQueueException extends  RuntimeException{
        public OverflowQueueException(){
        }
    }

    public E enque(E x) throws OverflowQueueException{
        if(num >= capacity)
            throw new OverflowQueueException();
        que[rear++] = x;
        num++;
        if(rear == capacity)
            rear = 0;
        return x;
    }
    public E deque() throws EmptyQueueException {
        if(num <=0)
            throw new EmptyQueueException();
        num--;
        E result = que[front++];
        if(front == capacity)
            front = 0 ;
        return result;
    }
    public Queue(int maxlen){
        num = front = rear = 0;
        capacity = maxlen;
        try{
            que = (E[])new Object[maxlen];
        }catch(OutOfMemoryError e){
            capacity = 0;
            e.printStackTrace();
        }

    }

}
