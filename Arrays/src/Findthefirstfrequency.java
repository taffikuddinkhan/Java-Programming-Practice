import java.util.HashMap;

public class Findthefirstfrequency {

    public static int conuntfreq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int v : arr){
            map.put(v,map.getOrDefault(v,0)+1);
        }

        for(int v : arr){
            if(map.get(v) == 1){
                return v;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 0, 4};
        System.out.println(conuntfreq(arr));
    }
}
