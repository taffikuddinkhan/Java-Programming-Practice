

public class TwoPointer_PalindromeCheck {
    public static boolean palindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left<right){
            char leftval = str.charAt(left);
            char rightval = str.charAt(right);

            if(leftval != rightval){
                System.out.println("Not palindrome");
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(palindrome(str));;
    }
}
