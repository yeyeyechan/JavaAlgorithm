package CH06;

public class Q5 {
    static void swap(int[] arr, int x, int y){
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;

    }

    static void cocktailBubbleSort(int [] arr, int n ){
        int left = 0;
        int right = n-1;
        int last = right;

        while(left <right){
            for(int i = right ; i>left; i--){
                if(arr[i] < arr[i-1]){
                    swap(arr , i , i-1);
                    last = i;
                }
            }
            left = last;
            for(int i = left; i < right; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    last = i;
                }
            }
            right = last;
        }
    }
}
