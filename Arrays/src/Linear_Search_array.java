import java.util.Scanner;

public class Linear_Search_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,3,4,70,30};
        int index = -1;
        System.out.println("Enter the number you want to search : -  ");
        int num = sc.nextInt();

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == num){
                index = i;
            }
        }

        if(index == -1){
            System.out.println("number not found !");
        }
        else{
            System.out.println("Value present in " + index+"th index");
        }
    }
}
