public class Reverse_a_number {

    public static int reverse ( int num , int rev){

//
        if(num == 0){
            return rev;
        }

        int lastdigit = num % 10;
        rev = rev * 10 + lastdigit;
        return reverse(num/10,rev);

    }
    public static void main(String[] args) {

        System.out.println(reverse(786,0));
    }
}
