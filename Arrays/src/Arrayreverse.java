import java.util.Arrays;

public class Arrayreverse {

    public static int[] reverse(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result[] = reverse(arr);

        System.out.println(Arrays.toString(result));
    }
}
