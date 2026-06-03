import java.util.Arrays;
import java.util.HashMap;

public class Twosum {

    public static void sum(int arr[] , int target){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }

    public static int[] optimizedTwoSum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++){
            int complement = target - arr[i];


            if(map.containsKey(complement)){
//                System.out.println(map.get(complement)+" , "+i);
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
       return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
//        sum(arr,9);
        int result[] = optimizedTwoSum(arr,9);
        System.out.println(Arrays.toString(result));
    }
}
