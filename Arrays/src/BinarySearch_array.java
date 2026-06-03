public class BinarySearch_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        int first_index = 0;
        int last_index = arr.length-1;
        int val = 5;


          while(first_index <= last_index){
            int mid = (first_index + last_index) / 2;

            if(arr[mid] == val){
                System.out.println("The value found at : " + mid +"th index");
                break;
            }

            if(val > arr[mid]){
                first_index = mid+1;
            }
            if(val < arr[mid]){
                last_index = mid-1;
            }
       }
}}
