public class EvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int v : nums){
            if(isEvenDigit(v)){
                result++;
            }
        }

        return result;
    }
    public static boolean isEvenDigit(int number){
        boolean result = false;
        int count = 0;
        while(number>0){
            int lastdigit = number % 10;
            number = number / 10;
            count++;
        }
        if(count % 2 == 0){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {555,901,482,1771,12};
        System.out.println(findNumbers(nums));

    }
}
