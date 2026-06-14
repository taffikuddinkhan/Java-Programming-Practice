public class MergeSortedArray {

    public static void merge(int arr1[] , int arr2[]){
        int current = 0;
        int left = 0;
        int right = 0;
        int result[] = new int[arr1.length + arr2.length];

        while(left < arr1.length && right < arr2.length){
            if(arr1[left] < arr2[right]){
                result[current] = arr1[left];
                current++;
                left++;
            }
            else {
                result[current] = arr2[right];
                current++;
                right++;
            }

        }
        while(left < arr1.length){
            result[current] = arr1[left];
            current++;
            left++;
        }
        while(right < arr2.length){
            result[current] = arr2[right];
            current++;
            right++;
        }

        for(int num : result){
            System.out.println( num  + " ");
        }
    }

    public static int[] SaveSpaceMerge(int arr1[] , int m , int arr2[] , int n){
        int index = m+n-1;
        int left = m-1;
        int right = n-1;

        while(left >= 0 && right >= 0 ){
            if(arr2[right] > arr1[left]){
                arr1[index] = arr2[right];
                right--;
                index--;
            }
            else{
                arr1[index] = arr1[left];
                left--;
                index--;
            }
        }
        while(right >= 0){
            arr1[index] = arr2[right];
            right--;
            index--;
        }

        return arr1;
    }
    public static void main(String[] args) {

        int arr1[] = {1,3,5};
        int arr2[] = {2,4,6};

        merge(arr1,arr2);

    }
}
