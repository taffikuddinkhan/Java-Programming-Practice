import java.sql.SQLOutput;

public class TwoPointer_SumPair {
    public static void FindPair(int arr[] , int target){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(arr[left] + " " + arr[right]);
                return;
            }
            if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }

        System.out.println("Pair not found");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8,10};
        int target = 10;

        FindPair(arr,target);
    }
}
