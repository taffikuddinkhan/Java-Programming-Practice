import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MedianOfTwoSorted {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result = 0.00;

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int val:nums1){
            list1.add(val);
        }
        for(int val:nums2){
            list1.add(val);
        }
        Collections.sort(list1);
        int size = list1.size();
        int middle = size / 2;
        boolean Even = false;
        if(size % 2 == 0){
            Even = true;
        }

        if(Even){
            result = (list1.get(middle-1)+list1.get(middle))/2.0;
        }
        else{
            result = list1.get(middle);
        }


        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
