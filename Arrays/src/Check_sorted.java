public class Check_sorted {

    public static boolean issorted(int arr[]){

        for(int i = 0 ; i<arr.length -1 ; i++){

            if(arr[i + 1] < arr[i]){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,1,6};
        System.out.println(issorted(arr));
    }
}
