import java.sql.SQLOutput;

public class ReverseInteger {

    public static void reverseNum(int num){
        int lastdigit = 0;
        int rev = 0;

        while(num>0){
            lastdigit = num%10;
            num/=10;
            rev = rev*10+lastdigit;
        }
        System.out.println(rev);
    }

    public static void main(String [] a){
        int b =  1234;
        reverseNum(b);
    }
}
