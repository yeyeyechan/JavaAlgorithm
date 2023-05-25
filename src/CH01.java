import java.util.Scanner;

class Q15{
    static void sprira(int n){
        for(int i =1 ; i <=n ; i++){
            for(int j =1 ; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<2*i  ;j++){
                System.out.print(i%n);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        sprira(5);
    }
}
class Q14{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = n ; i >=1; i--){
            for (int j =i ; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < n-i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = 1; i <=n ; i++){
            for(int j =1; j <=n-i; j++)
                System.out.print(" ");
            for(int j= 1 ; j <=i ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
class TriangleB{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for( int i = 0 ; i < n ; i++){
            System.out.println("*".repeat(i+1));
        }
        for(int i = 1 ; i <=n ; i ++){
            for(int j =1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Q13{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i =0 ; i < n ; i++){
            System.out.println("*".repeat(n));
        }
    }
}
class Q11 {
    public static void main(String [] args){
        System.out.printf("%3s", "|");
        for(int k = 1 ;k <=9 ; k++){
            System.out.printf("%3d", k);
        }
        System.out.println();
        for(int i =1 ; i <=9 ; i++){
            System.out.printf("%2d  |", i);
            for(int j =1 ; j <=9; j++){
                System.out.printf("%3d", j *i);
            }
            System.out.println();
        }

    }
}
class TwoDigits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n ;
        do{
            n = scan.nextInt();

        }while(!(n>=10 && n <=99));
    }
}
class PrintStar1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int w = scan.nextInt();

        for (int i =0 ; i < n ;i++){
            System.out.print("*");
            if ((i-1)%w ==0){
                System.out.println();
            }
        }
        for(int i = 0 ; i < n/w ; i++){
            System.out.println("*".repeat(w));
        }
        if(n%w!=0){
            System.out.println("*".repeat(n%w));
        }
    }
}
class Alternative1{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String result = "";
        for(int i = 0 ; i < n/2 ;i++){
            result += "+-";
        }
        if(n%2 != 0){
            result += "+";
        }
    }
}
class SumVerbose1{

    public static  void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;
        for(int i = 1 ; i <n ;i++){
            sum += i;
            System.out.println(i+" + ");
        }
        sum+=n;
        System.out.println(n + " = "+sum);
        System.out.println(n + " = " +(sum+=n));

    }
}
class Q10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int no = 0;

        while(n > 0){
            n /= 10;
            no ++;
        }

    }
}
class Q9 {

    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);

        int a ;
        int b;
        System.out.println("a값 : ");
        a = scan.nextInt();
        while(true){
            b = scan.nextInt();
            if(b >a){
                break;
            }
        }

    }
}
class Q7{

    static int gauss(int a, int b){
        return Math.abs((b-a+1)*(b+a))/2 + ((a-b)==0 ? a : 0);
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n ;

        do{
            System.out.println("값 : ");
            n = scan.nextInt();
        }while(n <=0);
        System.out.println(gauss(1,1));

    }
}
class SumWhile{
public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int sum = 0;
    int i = 1 ;
    while(i <= n) {
        sum +=i;
        i ++;
    }
    System.out.println(sum);
}
}
class median {
    static int med3 (int a, int b, int c){
        if(a>=b)
            if(b>=c)
                return b;
            else if(a<=c)
                return a;
            else
                return c;
        else if(c<=a)
            return a;
        else if(b<=c)
            return b;
        else
            return c;

    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in );

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(med3(a,b,c));
    }
}

public class CH01 {
    static int max4 (int a, int b, int c, int d){
        int max = a;
        if(max < b)  max =b;
        if(max <c) max =c ;
        if(max <d) max =d;
        return max;
    }

    static int min3 (int a, int b, int c){
        int min = a;

        if(min > b) min =b ;
        if(min >c) min = c;
        return min;
    }
    static int min4 (int a, int b, int c, int d){
        int min = a;

        if(min > b) min =b ;
        if(min >c) min = c;
        if(min > d) min = d;
        return min;
    }
    static void main(String [] args){

    }
}
