package boj;

import java.util.Scanner;

public class boj2753 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year%4 == 0 && (year%400 ==0 || year%100 !=0 )){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
