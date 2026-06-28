import java.util.Scanner;

public class EvenOdd {

    public static String evenorodd(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter value : ");
         int n = sc.nextInt();
        sc.close();
        return n%2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenorodd());
    }
}
