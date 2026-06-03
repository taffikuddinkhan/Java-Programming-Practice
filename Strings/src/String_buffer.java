public class String_buffer {

    public static void main(String[] args) {

        StringBuffer s =new StringBuffer("TAFFIK");
        s.append("UDDIN KHAN");
        System.out.println(s);
        s.insert(0,"MR.");
        System.out.println(s.length());
        s.setLength(70);
        System.out.println(s.length());

    }
}
