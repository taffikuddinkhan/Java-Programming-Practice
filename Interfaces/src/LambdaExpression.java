@FunctionalInterface
interface X{
    public void show();
}
public class LambdaExpression {
    public static void main(String[] args) {

//----------------- Inner class creating & calling --------------------------------------------------------------------
//        X obj = new X(){
//            @Override
//            public void show() {
//                System.out.println("hi hih ");
//            }
//        };
//----------------------------------- Call using Lambda Expression ----------------------------------------------------

        X obj =() -> System.out.println(" Iam in show ");
        obj.show();


    }
}
