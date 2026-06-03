public class Reverse_string {

    public static String reverse(String n){

        if(n.length()<=1){
            return n;
        }

       return reverse(n.substring(1)) + n.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }
}
