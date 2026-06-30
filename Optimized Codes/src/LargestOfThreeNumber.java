public class LargestOfThreeNumber {

    public static int findlargest(int num1 , int num2 , int num3){
        return Math.max(num1,Math.max(num2,num3));
    }

    public static void main(String[] args) {
        System.out.println(findlargest(16,50,23));
    }
}
