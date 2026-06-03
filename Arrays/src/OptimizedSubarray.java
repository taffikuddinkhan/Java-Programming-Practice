

public class OptimizedSubarray {

    public static void subarray(int arr[]){
        int currentsum = arr[0];
        int maxsum = arr[0];

        for(int i = 1 ; i<arr.length ; i++){
            currentsum = Math.max(arr[i] , currentsum+arr[i]);
            maxsum = Math.max(currentsum,maxsum);
        }

        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4};
        subarray(arr);
    }
}
