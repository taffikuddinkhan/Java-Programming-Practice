
@FunctionalInterface
interface A{
    void show();
}
class B implements A{

    @Override
    public void show() {
        System.out.println("hi guys... ! ");
    }
}
public class Functional_interface {

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
