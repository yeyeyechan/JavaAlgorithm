package CH06;

import java.util.Scanner;

//버블 정렬
public class CH06_1 {

    static void swap(int[] arr, int x, int y){
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;

    }

    static void bubbleSort3(int[] arr, int n){
        int k = 0;

        while(k <n-1){
            int last = n-1;
            for(int i = n-1 ; i > k ; i--){
                if(arr[i-1]> arr[i]){
                    swap(arr, i-1 , i);
                    last = i ;
                }
            }
            k = last;
        }
    }
    static void bubbleSort(int [] arr, int n){
        for(int i = 0 ; i<n-1 ; i++){
            int expo = 0;
            for(int j =n-1 ; j > i ; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr , j-1 , j);
                    expo++;
                }
            }
            if(expo ==0) break;
        }
    }
    static void bubbleSortFirst(int[] arr , int n ){
        for (int i =n-1 ; i >0 ; i--){
            for(int j = 0; j<i; j++){
                if(arr[j]>arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }

    public static void main(String[]  args){
        System.out.println("list length");
        Scanner scanner = new Scanner(System.in);

        int arrLen = scanner.nextInt();

        int[] arr = new int[arrLen];

        for(int i = 0 ; i < arrLen ;i++){
            arr[i] = scanner.nextInt();
            System.out.printf("arr[%d] : %d %n", i , arr[i]);
        }

        bubbleSort(arr, arr.length);

        for(int i = 0 ; i < arrLen ;i++){
            System.out.printf("arr[%d] : %d %n", i , arr[i]);
        }    }
}
