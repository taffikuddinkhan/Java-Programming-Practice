
class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class Exceptions {
    public static void main(String[] args) {

        int val  = 0;
        int val1 = 10;

        try{

            if(val == 0)
                throw new MyException("your dominant is zero brother fix that first ");
            int result = val1/val;
        }
        catch (MyException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("You are dividing with zero which is impossible" + e);

        }

    }
}
