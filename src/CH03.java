import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CH03 {
    static class generic<T>{
        T xyz;

        generic(T t){
            this.xyz = t;
        }
        T getXyz(){
            return xyz;
        }


    }
    static class PhyscData {
        private String name;
        private int height;

        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision =vision;
        }
        public String toString(){
            return name + " " +height + " " +vision;
        }
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return(d1.height >d2.height) ? 1: (d1.height < d2.height) ? -1 : 0;
            }
        }
    }
    static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;
        int pc;

        do{
            pc = (pl+pr)/2;

            if(a[pc] == key)
                for(;pl<=pc;pc--){
                    if(a[pc-1] < key)
                        break;
                }
                /*if (a[pc-1] ==key)
                    pr = pc -1;
                else
                    break;*/
            if(key < a[pc])
                pr = pc-1;
            else if(key > a[pc])
                pl = pc +1;

        }while(pl<=pr);
    return pc;
    }
    public static void main(String []args){
        int [] a = {1,2,3,5,6,6,6,6,6,8,9};
        int n = 11;
        int key =6;
        System.out.println(binSearchX(a, n, key));

        Scanner scan = new Scanner(System.in);

        PhyscData[] data = {new PhyscData("강민하", 162, 0.3),new PhyscData("강민하", 162, 0.3)};

        int height = scan.nextInt();

        int idx = Arrays.binarySearch(data, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        generic<String> h = new generic<String>("ABC");
    }
    static void binarySearch(int []a, int n ,int key){
        int pl = 0;
        int pr = a.length-1;

        int pc;
        String header = "---+";
        String [] arrow = new String[4+3*(n+1)];
        arrow[3] = "|";
        System.out.printf("%4s", "|");
        for(int i =0 ; i < n; i++){
            System.out.printf("%3d", i);
            header += "---";
        }
        header += "---";
        System.out.println();
        System.out.println(header);

        do{

            pc = (pl+pr)/2;
            System.out.printf("%4s", "|");
            if(pc!=pl)
                System.out.printf(String.format("%%%ds<-%%%ds+", 3*(pl+1)-2,3*(pc-pl))," "," ");
            else
                System.out.printf(String.format("%%%ds<-+", 3*(pl+1)-2)," ");

            if(pc!=pr)
                System.out.printf(String.format("%%%ds->",3*(pc-pl))," ");
            else
                System.out.print("->");
            System.out.println();

            System.out.printf("%3d|", pc);
            for(int i = 0 ; i < n; i ++){
                System.out.printf("%3d", a[i]);
            }

            if(key==a[pc]){
                System.out.println();
                System.out.println();
                break;
            }else if(key <a[pc]){
                pr = pc-1;
            }else {
                pl = pc +1;
            }
            System.out.println();
            System.out.printf("%4s", "|");
            System.out.println();
        }while(pl<=pc);

        System.out.printf("%d는 a[%d]에 있습니다.", key,pc);
    }
    static int searchIdx(int [] a, int n, int key, int[] idx){
        int index = 0 ;
        int idxLength = idx.length;
        for(int i = 0 ; i <n; i++){
            if (index == idxLength)
                break;
            if(a[i] == key){
                idx[index++] = key;
            }
        }
        return index;
    }
    static int seqSearch(int[] a, int key){
        a[a.length-1] = key;

        int index = 0;
        while(true){
            if(a[index] ==key)
                break;
            index++;
        }
        return index == a.length -1 ? -1 : index;
    }
    static int biSearch(int[] a, int key, int n ){
        int result = -1;

        int pl = 0;
        int pr = n -1;

        do{
            int pc = (pl+pr)/2;
            if(a[pc] ==key){
                return pc;
            }
            if(a[pc] < key){
                pl=pc + 1;
            }else{
                pr= pc-1;
            }
        }while(pl <= pr);
        return result;
    }


}
