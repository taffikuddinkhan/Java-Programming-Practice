import java.util.HashMap;
import java.util.HashSet;

public class Findfirstoccurence {

    public static void ocuur(int arr[]){

        HashSet<Integer> set = new HashSet<>();

        for(int v : arr){
            if(set.contains(v)){
                System.out.println(v);
                return;
            }
            set.add(v);
        }

        System.out.println(-1);

    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        ocuur(arr);

    }
}
