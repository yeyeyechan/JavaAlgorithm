package boj;

import java.io.IOException;

public class boj1008 {
    public static void main(String[] args) throws IOException {
        int a = System.in.read();
        System.in.read();
        int b = System.in.read();
        System.out.print((double)(a-48)/(b-48));
    }
}
