public class WealthyCoustomer {

    public int maximumWealth(int[][] accounts) {
        int ricehest = 0;

        for(int[] rows : accounts){

            int sum =0;

            for(int i : rows){
                sum+= i;
            }
            if(sum > ricehest){
                ricehest = sum;
            }
        }

        return ricehest;
    }

    public static void main(String[] args) {

    }
}
