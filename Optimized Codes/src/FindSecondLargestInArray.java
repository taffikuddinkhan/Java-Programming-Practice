public class FindSecondLargestInArray {

    public static int findSecondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        if(arr.length < 2){
            return -1;
        }

        for(int i = 0 ; i<arr.length ; i++){
            if(largest < arr[i]){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }

        if(secondlargest == Integer.MIN_VALUE){
            return -1;
        }

        return secondlargest;
    }

    public static void main(String[] args) {
        int arr[] = {54,55};
        System.out.println(findSecondLargest(arr));
    }
}
