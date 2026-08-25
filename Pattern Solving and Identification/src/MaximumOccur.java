import java.net.SocketTimeoutException;
import java.util.*;
public class MaximumOccur {

    public static void maxOccur(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)+1);
            }else{
                freq.put(num,1);
            }
        }
        int max = arr[0];
        for(int check : freq.keySet()){
            if(freq.get(check) > max){
                max = check;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] a){

        int[] arr = {1, 2, 2, 3, 3, 3};
        maxOccur(arr);
    }
}
