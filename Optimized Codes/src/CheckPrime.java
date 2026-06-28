import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int val = sc.nextInt();
        boolean flag = true;
        if (val <= 1) {
            flag = false;
        }
        else if (val == 2) {
            flag = true;
        }
        else if (val % 2 == 0) {
            flag = false;
        }
        else {

            for (int i = 3; i * i <= val; i += 2) {
                if (val % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        sc.close();
        return flag ;


    }
    public static void main(String[] args) {
        System.out.println(isPrime());
    }
}