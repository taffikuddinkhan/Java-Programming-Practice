public class Palindrome {

    public static String palin(String n){

        if(n.length() <= 1){
            return n;
        }

       return palin(n.substring(1)) + n.charAt(0);

    }

    public static void main(String[] args) {

        String val = "MADAM";
        String rev = palin(val);

        if(val.equals(rev)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
