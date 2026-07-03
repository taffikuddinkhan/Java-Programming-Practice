public class ArmstrongNumber {

    public static boolean armstrong(int val){
        int armstrong = 0;
        int count = 0;
        int original = val;
        int iterate = val;
        while(val != 0 ){
            count++;
            val = val / 10;
        }

        while(iterate != 0 ){
            int last = iterate%10;
            armstrong = (int) (armstrong + Math.pow(last,count));
            iterate = iterate/10;
        }

        return armstrong == original;
    }

    public static void main(String[] args) {
        System.out.println(armstrong(154));
    }
}
