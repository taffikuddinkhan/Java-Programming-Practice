public class Selectionsort_array {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 3, 9, 45, 4, 2};

        for (int j = 0; j < arr.length-1; j++) {

            int min_index = j;

            for (int i = j+1; i < arr.length; i++) {

                if(arr[i] < arr[min_index]){
                    min_index = i;
                }

            }

            int temp = arr[j];
            arr[j] = arr[min_index];
            arr[min_index] = temp;

        }


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
