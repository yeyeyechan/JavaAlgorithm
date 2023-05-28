package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
    public static void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[] array = new String[count];
        for(int i =0 ; i < count ;i++){
            array[i] = br.readLine();
        }

        for(int i =0 ; i< count; i++){
            Stack<Object> stk = new Stack<Object>();
            boolean check = false;
            Loop1 : for(char ele : array[i].toCharArray()){
                switch (ele){
                    case '(':
                        stk.push('(');
                        break;
                    default:
                        if(stk.isEmpty()){
                            System.out.println("NO");
                            check = true;
                            break Loop1;
                        }
                        else{
                            stk.pop();
                        }
                }
            }
            if(!check){
                if(stk.isEmpty())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

    }

}
