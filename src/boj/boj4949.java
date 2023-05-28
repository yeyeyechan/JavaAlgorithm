package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        Stack<Object> stk = new Stack<Object>();
        String input = br.readLine();

        while(!".".equals(input)){
            stk = new Stack<Object>();
            boolean check = false;
            Loop1 : for(char ele : input.toCharArray()){
                switch (ele){
                    case '(' : case '[' :
                        stk.push(ele);
                        break;
                    case ')' : case ']':
                        if(stk.isEmpty()){
                            System.out.println("no");
                            check = true;
                            break Loop1;
                        }
                        else if((char) stk.peek() =='(' && ele ==')'){
                            stk.pop();
                            break;
                        }else if((char) stk.peek() =='[' && ele ==']'){
                            stk.pop();
                            break;
                        }else {
                            System.out.println("no");
                            check = true;
                            break Loop1;
                        }
                }
            }
            if(!check ){
                if(stk.isEmpty())
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            input = br.readLine();

        }
    }
}
