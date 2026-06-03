import java.util.ArrayList;
import java.util.Collection;

public class Demo {

    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);

        for(int n : num){
            System.out.println(n);
        }
    }
}
