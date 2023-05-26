package CH05;

public class Ex10 {
    static boolean [] flag_a = new boolean[8];
    static boolean [] flag_b = new boolean[15];
    static boolean [] flag_c = new boolean[15];

    static int [] arr = new int[8];

    static void print(){
        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static  void set(int i){
        for(int j = 0 ; j < 8 ; j++){
            if(flag_a[j] == false && flag_b[i+j] == false && flag_c[7+i-j] ==false){
                arr[i] = j;
                if(i == 7){
                    print();
                }else{
                    flag_a[j] =flag_b[i+j] =flag_c[7+i-j] =true;
                    set(i+1);
                    flag_a[j] =flag_b[i+j] =flag_c[7+i-j] =false;
                }
            }
        }
    }
    static void set(){
        int i = 0;
        while(true){


        }
    }
    public static void main(String[] args){

    }
}
