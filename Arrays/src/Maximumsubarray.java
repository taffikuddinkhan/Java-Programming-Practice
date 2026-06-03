public class Maximumsubarray {

    public static void find_maxsubaarray(int arr[]){
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            int currentsum = 0;
            for( int j = i ; j<arr.length ; j++){
                currentsum += arr[j];

                if(currentsum > maxsum){
                    maxsum = currentsum;
                }
            }
        }

        System.out.println("Maximum subarray value : " + maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4};
        find_maxsubaarray(arr);
    }
}
