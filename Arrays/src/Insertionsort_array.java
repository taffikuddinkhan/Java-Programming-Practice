public class Insertionsort_array {

    public static void main(String[] args) {
        int arr[] = {103,21,3,14,25,6};

        for(int i = 1 ; i<arr.length ; i++){

            int min_val = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > min_val){

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = min_val;

        }

        for(int num :arr){
            System.out.println(num + " ");
        }

    }
}
