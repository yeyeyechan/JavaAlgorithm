package boj;

import java.util.Scanner;

public class boj2480 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int bigger = a;
        int b = scanner.nextInt();
        if(bigger<b){
            bigger = b;
        }
        int c = scanner.nextInt();
        if(bigger<c){
            bigger = c;
        }
        int result = 0;
        if(a == b){
            if(b == c){
                result = 10000 + a*1000;
            }else{
                result = 1000 + a*100;
            }
        }else if(b==c){
            result = 1000 + b*100;
        }else if(a==c){
            result = 1000 + a*100;
        }else{
            result = bigger*100;
        }
        System.out.println(result);
    }
}
