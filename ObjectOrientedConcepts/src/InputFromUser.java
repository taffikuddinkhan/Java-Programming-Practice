import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.println("Enter the number");
        try{
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);

        }
        catch (Exception e){
            System.out.println("Enter a valid number " + e);
        }
        finally {
            bf.close();
        }


    }
}
