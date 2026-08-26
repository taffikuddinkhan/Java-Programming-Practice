import java.util.*;

public class TcsProblem {

    public static int[] solution(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int index = 0;
        for(int num : arr){

            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for(int num : map.keySet()){
            if(map.get(num) > 3){
                res.add(num);
            }
        }

        int[] sol = new int[res.size()];
        for(int val : res){
            sol[index] = val;
            index++;
        }
        
        return sol;
    }
    public static void main(String[] args) {

        int[] arr = {1,1,1,1,2,3,4,5,5,5,5,6,6,6,6,6,7,7,};
        String out = Arrays.toString(solution(arr));
        System.out.println(out);

    }
}
