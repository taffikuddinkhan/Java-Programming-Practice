public class CheckPalindrome {

    public static String Palindrome(int num){
        int rev = 0;
        int copyval = num;

        while(num != 0){
            int last = num % 10;
            rev = rev * 10 + last;
            num = num/10;
        }

        return copyval==rev ? "palindrome" : "notpalindrome";
    }

    public static void main(String[] args) {
        System.out.println(Palindrome(121));
    }
}
