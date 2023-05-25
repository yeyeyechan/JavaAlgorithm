import java.util.Scanner;

public class JAVA03 {
    public static void main(String[] args){
        //if 문 연습.
        int score = 90;
        char grade = ' ' , opt ='0';
        if(score >= 90){
            grade = 'A';
            if(score >=98){
                opt = '+';
            }else if(score <94){
                opt = '-';
            }
        }else if(score >=80){
            grade = 'B';
            if(score>=88){
                opt = '+';
            }else if(score <84){
                opt = '-';
            }
        }

        //switch
        System.out.println("현재 월 을 입력하세요");
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        switch(month){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            case 9: case 10:
                System.out.println("fall");
                break;
            default:
            //case 11: case 12:
                System.out.println("winter");
                //break;
        }
    }

}
