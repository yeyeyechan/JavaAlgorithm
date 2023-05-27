package CH06;
//쉘정렬
public class ShellSort {

    //일반 쉘 정렬
    static void shellSort(int [] arr, int n ){
        for(int h = n/2 ; h > 0; h/=2){
            for(int i = h ; i <n ; i ++){
                int j ;
                int tmp = arr[i];
                for( j = i -h ; j>=0 && arr[j] >= tmp ; j -=h){
                    arr[j+h] = arr[j];
                }
                arr[j+h] = tmp;
            }
        }
    }
    //개선된 증분값 계산 하는 쉘정렬
    static void shellSortH(int arr[] , int n ){
        int h;
        for(h =1; h < n ; h = 3*h +1);

        for(; h>0 ; h/=3){
            for(int i = h ; i< n; i++){
                int j;
                int tmp = arr[i];
                for(j = i -h ; j>=0 && arr[j]> tmp ; j-=h){
                    arr[j+h] = arr[j];
                }
                arr[j+h] = tmp;
            }
        }
    }
}
