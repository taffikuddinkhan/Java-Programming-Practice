public class FindingMissing {

    public static void findMissing(int n , int[] arr){
       int expectedsum = n*(n+1)/2;
       int acctual = 0;
        for(int num : arr){
            acctual += num;
        }
       int missing = expectedsum-acctual;
       System.out.println(missing);
    }
    public static void main(String[] a){
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        findMissing(n, arr);
    }
}
