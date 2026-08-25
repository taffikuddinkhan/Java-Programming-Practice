import java.util.*;
public class FindingDuplicate {

    public static void findDuplicate(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        for(int v : arr){
            if(seen.contains(v)){
                System.out.println("Duplicate value " + v);
            }
            seen.add(v);
        }
    }

    public static void main(String[] a){
        int[] arr = {1, 3, 4, 2, 3};
        findDuplicate(arr);
    }
}
