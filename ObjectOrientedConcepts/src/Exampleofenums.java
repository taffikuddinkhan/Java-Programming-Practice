enum Laptop{

    Mackbook(120000),Asus(250000),Dell(120000),Hp(97000);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Exampleofenums {

    public static void main(String[] args) {

//     Laptop lap = Laptop.Mackbook;
//     System.out.println(lap + " : " + lap.getPrice());

     for(Laptop l : Laptop.values()){
         System.out.println(l + " : " + l.getPrice() + " : " + l.ordinal());
     }


    }

}
