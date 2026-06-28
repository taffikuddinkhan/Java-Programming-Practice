import java.util.Scanner;

public class FibonaciiSeries {

    public static void fibonaci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int val = sc.nextInt();
        int a = 0;int b = 1;

        for(int i = 1 ; i<=val ; i++){
            int c= a+b;
            System.out.println(a+ " ");
            a=b;b=c;
        }
        sc.close();
    }

    public static void main(String[] args) {
        fibonaci();
    }
}
