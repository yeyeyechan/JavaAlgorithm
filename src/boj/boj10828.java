package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        //Scanner scanner = new Scanner(System.in);
        //int total  =scanner.nextInt();
        String[] arr =  new String[total];
        //scanner.nextLine();

        for(int i =0 ; i < total ; i++){
            //arr[i] = scanner.nextLine();
            arr[i] = br.readLine();
        }
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ; i <total ; i++){
            String command = arr[i].split(" ")[0];
            if("push".equals(command)){
                stack.push(Integer.parseInt(arr[i].split(" ")[1]));
            }else if("pop".equals(command)){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }else if("size".equals(command)){
                System.out.println(stack.size());
            }else if("empty".equals(command)){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if("top".equals(command)){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
