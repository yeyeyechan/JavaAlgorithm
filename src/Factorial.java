import CH04.IntStack;

public class Factorial {
    static int factorial(int n){
        if(n >0)
            return n*factorial(n-1);
        else
            return 1;
    }
    static int gcd(int x, int y){
        if(y== 0)
            return x;
        else
            return gcd(y, x%y);
    }
    static int noFactorial(int n ){
        int result =1;
        while(n>1){
            result *=n--;
        }
        return result;
    }
    static void recur(int n){
        if(n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }
    static void recur2(int n ){
        while(n>0){
            recur2(n-1);
            System.out.println(n);
            n = n - 2;
        }
    }
    static void recur3(IntStack st, int n ){
        while(true) {
            if (n > 0) {
                st.push(n);
                n = n - 1;
                continue;
            }
            if (!st.isEmpty()) {
                n = st.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
    static void move(int no , int x, int y){
        if(no >1)
            move(no-1, x,6-x-y);
        System.out.printf("%d 번쨰 원반을 %d 에서 %d 로 옮김", no, x,y);

        if(no >1)
            move(no-1, 6-x-y, y);
    }

    static void recur4(IntStack st, int n ){
        while(true){
            if(n>0){
                st.push(n);

            }
            if(n-1>0){
                st.push(n-1);
            }
            if(!st.isEmpty()){
                if(n>0){
                    n = st.pop();
                    st.push(n-1);
                    st.push(n-2);
                    System.out.println(n);
                }
            }
        }
    }
    static void recur3(String[] memo, int n){
        if(n >0){
            if(memo[n+1] != null)
                System.out.println(memo[n+1]);
            else{
                if(n>0){
                    recur3(memo, n-1);
                    System.out.println(n);
                    recur3(memo, n-2);
                    memo[n+1] = memo[n] + "n" + memo[n-1];
                }else{
                    memo[n+1] = "";
                }


            }
        }
    }
    static int gcdArray(int[] a, int start, int n){
        if(n == 1)
            return a[start];
        else if(n == 2)
            return gcd(a[start], a[start+1]);
        else
            return gcd(a[start],gcdArray(a, start+1, n-1));
    }
    static int noGcd(int x, int y){
        while(y !=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
    public static void main(String[] args){

        System.out.println(factorial(10));
    }
}
