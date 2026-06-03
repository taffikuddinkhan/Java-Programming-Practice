
class Human{
    private int age ;
    private String name ;

    public int getAge(){
        return age;
    }

    public String getNmae(){
        return name;
    }

    public void setname(String Name){
        this.name = Name;
    }

    public void setage (int Age ){
        this.age = Age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Human h = new Human();
//        System.out.println(h.getNmae() + " : " + h.getAge());
        h.setname("TAFFIK");
        h.setage(20);
        System.out.println(h.getNmae() + " : " + h.getAge());

 
    }
}
