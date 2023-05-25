package boj;

import java.util.Scanner;

public class boj1000 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] number = line.split(" ");

        System.out.println (Integer.parseInt(number[0]) + Integer.parseInt(number[1]));
        /*
        * int a = System.in.read();
        * System.in.read();
        * int b = System.in.read();
        *
        * System.out.println((a-48)+(b-48));
        *
        * */
    }
}
