import java.util.HashMap;

public class Countmaxfreq {

    public static int conutfreq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int v  : arr){
            map.put(v,map.getOrDefault(v,0)+1);
        }
        int result = 0;

        for (int key : map.keySet()) {

            if(map.get(key) > result){
                result = map.get(key);
            }
//            System.out.println(key + " -> " + map.get(key));
        }

        return result;

    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,5,4,2,2,1};
        System.out.println(conutfreq(arr));

    }
}
