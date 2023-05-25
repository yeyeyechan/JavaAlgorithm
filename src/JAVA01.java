
public class JAVA01{
public static void main(String [] args){
    char ch = 'A';
    char uniCh = '\u0041';
    char uniCh2 = 0X0041;
    System.out.printf("ch 는 %c 이고 유니코드는 %d  16진수로는 %#X %n", ch, (int)ch, (int)ch);
    System.out.printf("unCh %c %d %#X%n", uniCh, (int)uniCh, (int)uniCh);
    System.out.printf("unCh %c %d %#X", uniCh2, (int)uniCh2, (int)uniCh2);

    float f = 9.1234567890123456767890f;
    double d = 9.123456789012345676890d;

    System.out.printf("%20.24f", f);
    System.out.println(d);
    int x = 5;
    x = ++x - x++;
    System.out.println(x);

    char a = 'a';
    for(int i = 0 ; i < 26; i++){
        System.out.print(a++);
    }
    System.out.println();
    char A = 'A';
    for(int i =0 ; i < 26; i++){
        System.out.print(A++);
    }
    char zero = '0';
    System.out.println();
    for(int i =0 ; i < 10 ; i++){
        System.out.print(zero++);
    }
    char aa = (char)('a' -32);
    System.out.println(aa);

    char y = 'a' + 1;
    System.out.print(y);

    float pi = 3.156623f;

    float result = (int)(pi*1000+0.5)/1000f;

    System.out.println(result);

    double newpi  = 3.1566;
    double newresult = Math.round(newpi*1000)/1000.0;
    System.out.println(newresult);

    System.out.println(-10%-8);
    System.out.println(-10%8);
    System.out.println(10%-8);

    int z = 10 ;
    System.out.println(20<x || x<5 );
    }
}
