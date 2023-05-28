package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String [] array = new String[count];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i =0 ; i < count;i++){
            array[i] = br.readLine();
        }

        for(int i =0 ; i < count ;i++){
            switch (Integer.parseInt(array[i])){
                case 0:
                    stk.pop();
                    break;
                default:
                    stk.push(Integer.parseInt(array[i]));
            }
        }
        int sum = 0;
        while(!stk.isEmpty()){
            sum += stk.pop();
        }
        System.out.println(sum);



    }
}
