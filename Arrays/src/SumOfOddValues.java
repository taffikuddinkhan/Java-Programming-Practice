
import java.util.*;
public class SumOfOddValues {

    public static void countUnique(int arr[]){
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }
        for(int n : set){
            sum = sum + n;
        }

        System.out.println(sum);
    }

    public static void main(String args[]){
        int [] arr = {1,2,3,2,3,4,5,4};
        countUnique(arr);
    }
}
