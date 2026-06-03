public class Array_traversal_find_second_largest {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6,7};

        if(arr.length < 2){
            System.out.println("No second largest element present");
            return;
        }

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }

            else if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }

        if(second_max == Integer.MIN_VALUE){
            System.out.println("No second largest element present");
        }
        else{
            System.out.println("Second largest element: " + second_max);
        }
    }
}