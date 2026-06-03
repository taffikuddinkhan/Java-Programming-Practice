public class sum_of_naturals {

    public static void sum(int start , int upto , int sum){


        if(start == upto){
            sum += start;
            System.out.println(sum);
            return;
        }

        sum += start;
        sum(start+1,upto,sum);

    }
    public static void main(String[] args) {

        sum(1,5,0);

    }
}
