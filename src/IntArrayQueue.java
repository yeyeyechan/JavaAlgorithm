public class IntArrayQueue {
    private int[] que;
    private int capacity;
    private int num;

    public void enqueue (int x){
        que[num++] = x;
    }
    public int dequeue(){
        int result = que[0];

        for(int i =0 ; i < num - 1 ; i++){
            que[i] = que[i+1];
        }
        num--;
        return result;
    }
}
