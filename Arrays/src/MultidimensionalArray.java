import java.util.Scanner;

public class MultidimensionalArray {

    static Scanner sc = new Scanner(System.in);

    public static void insertvalue(int nums[][]){
        int input = 0;
        for(int i = 0; i<3 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print(" Enter the value for : (" + i + "," + j +")" );
                input = sc.nextInt();
                nums[i][j] = input;
            }
        }
    }

    public static void display(int nums[][]){
        System.out.println("Printing all elements of the array : ");

        // printing the array using ordinary for loop --------------------

//        for(int i = 0; i<3 ; i++){
//            for(int j = 0 ; j<4 ; j++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

        // printing array using the for each loop -------------------------

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int nums [] [] = new int[3][4];
        Scanner sc = new Scanner(System.in);
//        insertvalue(nums);
        display(nums);

    }
}
