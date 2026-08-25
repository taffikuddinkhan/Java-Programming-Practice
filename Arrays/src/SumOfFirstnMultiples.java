
public class SumOfFirstnMultiples {

    public static void calculateMultiples(int val){

        int sum = 0;
        for(int i = 1 ; i<=10 ; i++){
            sum += i*val;
        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        calculateMultiples(10);
    }
}
