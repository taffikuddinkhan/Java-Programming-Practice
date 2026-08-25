public class FindPairWithGivenSum {

    public static void sumFind(int[] arr,int sum){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            if(arr[left]+arr[right] == sum){
                System.out.println(arr[left] + " " + arr[right]);
                break;
            }
            else if(arr[left]+arr[right] < sum){
                left++;
            }
            else if(arr[left]+arr[right] > sum){
                right--;
            }

        }

        System.out.println("pair not found");

    }
    public static void main(String[] a){
        int[] arr = {2, 7, 11, 15};
        int target = 170;

        sumFind(arr,target);
    }
}
