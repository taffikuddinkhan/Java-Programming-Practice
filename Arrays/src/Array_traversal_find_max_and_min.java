public class Array_traversal_find_max_and_min {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int min = arr[0] , max = arr[0];

        for(int i = 1 ; i<arr.length ; i++){

            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("The minimum value is :" + min);
        System.out.println("The maxiimum value is :" + max);

    }
}
