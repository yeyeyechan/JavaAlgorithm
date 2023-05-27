package boj;

import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        int _hour = 0;
        int _min = 0;
        if((min-45) < 0){
            _min = 60+(min-45);
            if(hour == 0){
                _hour = 23;
            }else {
                _hour = hour - 1;
            }
        }else{
            _hour = hour;
            _min = min-45;
        }
        System.out.printf("%d %d", _hour , _min);

        /*
        * hour < 0
        * hour += 24
        *
        *
        * */
    }
}
