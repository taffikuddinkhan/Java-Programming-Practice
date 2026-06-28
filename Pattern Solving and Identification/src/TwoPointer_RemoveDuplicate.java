public class TwoPointer_RemoveDuplicate {

    public static void EliminateDuplicate(int arr[]){
        int left = 0;

        for( int j = 1 ; j<arr.length ;j++ ){

            if(arr[left] != arr[j] ){
                left++;
                arr[left] = arr[j];
            }
        }

        for(int i = 0 ; i<=left ; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,5,5};
        EliminateDuplicate(arr);
    }
}
