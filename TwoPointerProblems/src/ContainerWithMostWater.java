public class ContainerWithMostWater {

    public static void MaxWater(int arr[]){
        int left =0;
        int right = arr.length-1;
        int maxwater = 0;

        while(left < right){
            int width = right - left;
            int height = Math.min(arr[left],arr[right]);
            int currentwater = width*height;
            maxwater = Math.max(currentwater,maxwater);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxwater);
    }
    public static void main(String[] args) {

        int arr[] = {1,8,6,2,5,4,8,3,7};
        MaxWater(arr);
    }
}
