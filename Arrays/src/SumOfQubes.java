import java.util.*;
public class SumOfQubes {

    public static int  AllQubeSum(int start , int end ){
        int qubesum = 0;
        for(int i = start ; i<= end  ; i++){

            qubesum += (int) Math.pow(i,3);
        }

        return qubesum;
    }


    public static void main(String args[]){

        System.out.print(AllQubeSum(4,9));

    }
}
