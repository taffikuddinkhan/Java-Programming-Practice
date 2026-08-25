import java.util.*;
public class FreqOfElement {

    public static void countFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){

            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }

        System.out.println(map);

    }

    public static void main(String []a){
        int[] arr = {1, 2, 2, 3, 3, 3};
        countFreq(arr);
    }
}
