package CH05;

import java.util.Scanner;

public class Q8 {
    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }
    static  void nonRecurMove(int no, int x, int y) {
        int[][] arr = new int[100][3];
        int ptr =- 1;
        while(true){
            if(no >1 ){
                ptr++;
                arr[ptr][0] = no;
                arr[ptr][1] = x;
                arr[ptr][2] = y;
                no = no -1;
                x = x;
                y = 6-x-y;
                continue;
            }

            System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);


        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = stdIn.nextInt();

        move(n, 1, 3);    // 제 1 기둥에 쌓인 n개를 제 3 기둥으로 옮김
    }
}
