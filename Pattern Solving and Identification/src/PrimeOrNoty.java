public class PrimeOrNoty {

    public static void main(String[] a){
        int val = 27;
        int count = 0;

        if(val == 2){
            System.out.println("Prime");
            return;
        }

        for(int i = 1 ; i<=val; i++){

            if(val%i==0){
                count++;
            }
        }

        if (count==2){
            System.out.println("prime " + val);
        }
        else{
            System.out.println("Not Prime " + val);
        }
    }
}
