package CH05;
import CH04.IntStack;
public class Q6 {
    static  void recur3(int n){
        if(n>0){
            recur3(n-1);
            recur3(n-2);
            System.out.println(n);
        }
    }
    static void noRecur3(int n){
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int ptr = -1;
        int target = 0;
        while(true){
            if(n>0){
                ptr++;
                arr1[ptr] = n;
                arr2[ptr] = target;

                if(target == 0){
                    n  = n-1;
                }else if(target ==1){
                    n = n -2;
                    target =0;
                }
                continue;
            }
            do{

            }while(target == 2);
        }

    }
    public static void main(String [] args){

    }
}
