import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class YMD {
    int y;
    int m ;
    int d;

    public YMD(int y, int m , int d){
        this.y = y;
        this.m= m;
        this.d = d;
    }



}
class Q6{
    static  int change(int n, int z, char [] d){
        String word = "0123456789ABCDEFGHIJKLMNOP";
        int i =0;
        System.out.print(z + " |");
        System.out.printf("%4d" , n);
        System.out.println();
        System.out.println("--------");
        do{
            d[i++] = word.charAt(n%z);
            n /=z;
            System.out.print(z + " |");
            System.out.printf("%4d" , n);
            System.out.printf(" --- %1c" , d[i-1]);
            System.out.println();
            System.out.println("--------");

        }while(n!=0);

        System.out.printf("  %4d", 0);
        System.out.printf(" --- %1c" , d[i-1]);
        for(int j =0;j < i/2 ;j++){
            char t =  d[j];
            d[j] = d[i -1 -j];
            d[i-1-j] = t;
        }
        return i;
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n ;
        int z;
        do{
            n = scan.nextInt();
        }while(n<0);

        do{
            z = scan.nextInt();
        }while(z<2 || z >52);
        char [] d = new char[32];
        int digit = change(59,2,d);
        System.out.println();
        for(int i = 0 ; i <digit ; i ++){
            System.out.print(d[i]);
        }
    }
}
class Q2{
    static int sumOf(int[]a){
        int sum = 0;
        for(int i = 0 ; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    static void copyOf(int []a, int[]b){

        for(int i =0; i < a.length;i++){
            b[i] = a[i];
        }
    }
    static void rcopy(int[]a, int[]b){
        int num = a.length <=b.length ? a.length : b.length;
        for(int i = 0 ; i < num; i++){
            a[i] = b[b.length -1-i];
        }
    }
    public static void main (String [] args){
        int[] arr = new int[5];
        Random rand = new Random();
        for(int i = 0 ; i < 5; i++){
            arr[i]= rand.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));
        int length =arr.length;
        for(int i = 0 ; i < length/2 ; i++){
            int t = arr[i];
            arr[i] = arr[length -1-i];
            arr[length-1-i]= t;
        }
        System.out.println(Arrays.toString(arr));
    }
}

public class CH02 {
}
