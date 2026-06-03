public class Array_traversal_oddevencount {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        int odd = 0, even = 0;

        for(int i = 0 ; i< arr.length ; i++){

            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Odd values = " + odd + " , " + "Even values = " + even);
    }
}
