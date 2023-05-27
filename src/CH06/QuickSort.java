package CH06;

public class QuickSort {
    static void swap(int[] arr, int pl ,int pr){
        int tmp = arr[pl];
        arr[pl] = arr[pr];
        arr[pr] = tmp;
    }
    static int sort3elem(int [] arr, int a, int b, int c){
        if(arr[b] < arr[a]) swap(arr, a,b);
        if(arr[b] > arr[c]) swap(arr, b,c);
        if(arr[b] <arr[a]) swap(arr, a,b);

        return b;
    }
    static void quickSort(int[] arr , int left, int right){
        int pl = left;
        int pr = right;

        int b = sort3elem(arr, pl, (pl+pr) /2, pr);

        int x = arr[b];
        swap(arr, b, pr-1);
        pl++;
        pr -=1;

        do{
            while(arr[pr] > x) pr--;
            while(arr[pl] < x) pl ++;
                if(pl<=pr){
                    swap(arr, pl++, pr--);
                }
        }while(pl <=pr);

        if(left <pr) quickSort(arr, left, pr);
        if(pl < right) quickSort(arr, pl,  right);
    }

    static void nonRecurquickSort(int[] arr , int left, int right){
        IntStack lstk = new IntStack(right-left +1);
        IntStack rstk = new IntStack(right-left +1);

        while(!lstk.isEmpty()){
            int pl = lstk.pop();
            int pr = rstk.pop();
            int x =arr[(pl+pr)/2];

            do{
                while(arr[pr] > x) pr--;
                while(arr[pl] < x) pl ++;
                if(pl<=pr){
                    swap(arr, pl++, pr--);
                }
            }while(pl <=pr);

            if(left <pr) lstk.push(left); rstk.push(pr);
            if(pl < right) lstk.push(pl); rstk.push(right);
        }

    }
}
