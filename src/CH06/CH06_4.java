package CH06;
//선택정렬
public class CH06_4 {
    static void swap(int[] arr, int x, int y){
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }

    static void selectionSort(int [] arr, int n){
        for(int i =0 ; i < n-1 ;i++){
            int min = i;
            for(int j = i+1 ; j< n; j++){
                if(arr[min] >arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
    static void insertSort(int[] arr, int n ){
        for(int i =1 ; i <n ; i++){
            int j;
            int tmp =arr[i];
            for( j = i ; j> 0 && arr[j-1] > tmp ; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = tmp;
        }
    }

}
