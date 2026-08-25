import java.util.*;
public class FindCommonElements {

    public static void commonFind(int [] arr , int arr1[]){
        HashSet<Integer> common = new HashSet<>();
        for(int num : arr){
            common.add(num);
        }
        for(int check : arr1){
            if(common.contains(check)){
                System.out.println(check + " ");
            }
        }
    }

    public static void main(String[] a){

       int[] A = {1,2,3,4};
       int[] B = {3,4,5,6};
       commonFind(A,B);

    }
}
