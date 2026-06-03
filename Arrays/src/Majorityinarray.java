public class Majorityinarray {

    public static void find_major(int arr[]){

//        int length = arr.length;
//
//        for(int i = 0 ; i <arr.length ; i++){
//
//            int count = 0 ;
//
//            for( int j = 0 ; j<arr.length ; j++){
//
//                if(arr[i] == arr[j]){
//                   count ++;
//                }
//            }
//
//            if(count > length/2){
//                System.out.println(" majority element is : " + arr[i] );
//                return;
//            }
//        }

        int half = arr.length/2;

        for(int i = 0 ; i <arr.length ; i++){
            int count  = 0;
            
            for(int j = 0 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;

                }
            }
            if(count>half){
                System.out.println("majority " + arr[i]);
                return;
            }
        }

        System.out.println(" No majority element ");
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,1,1};
        find_major(arr);
    }
}
