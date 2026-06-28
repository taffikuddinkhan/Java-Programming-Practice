import java.util.Scanner;

public class FcatorialOfaNumber {

    public static int factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int val = sc.nextInt();
        int fact = 1;
        if(val <= 2){
            return val;
        }
        else{
            for(int i = 1 ; i<=val ; i++){
                fact = fact*i;
            }
        }
        sc.close();
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial());
    }
}
