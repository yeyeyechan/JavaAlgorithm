package boj;

import java.util.Scanner;

public class boj2525 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        int total = scanner.nextInt();

        int currentTotal = hour*60 + min ;

        int nextTotal = currentTotal+total;

        int nextHour = nextTotal/60 >23 ? nextTotal/60 - 24 : nextTotal/60;
        int nextMin = nextTotal%60 ;
        System.out.printf("%d %d", nextHour , nextMin);
    }
}
