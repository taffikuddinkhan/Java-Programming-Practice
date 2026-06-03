

public class ReversebyKSteps {

    public static void reverseK(int arr[] , int k){
        int current = arr.length - k;
        int currentnext = current+1;
        int remain = arr.length - current;
        int original = arr.length - k;
        int left =0;
        int right = arr.length-1;

        if(k == arr.length)
            for(int n : arr){
                System.out.print(n + " ");
            }
        else if(k==0)
            for(int n : arr) {
                System.out.print(n + " ");
            }
        else

           for(int i = 0 ; i<k ; i++){
               int last = arr[arr.length-1];

               for(int j = arr.length-1 ; j>0 ;  j--){
                   arr[j] = arr[j-1];

               }

               arr[0] = last;
           }


        for(int n : arr){
            System.out.println(n + " ");
        }


    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        reverseK(arr,k);

    }
}
