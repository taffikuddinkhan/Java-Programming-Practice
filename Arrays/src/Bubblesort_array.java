public class Bubblesort_array {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,0};


    for(int j = 0 ; j<arr.length -1 ; j++) {

        for (int i = 0; i < arr.length - 1 - j ; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

    }

        for( int num : arr){
            System.out.println(num + " ");
        }
    }
}
