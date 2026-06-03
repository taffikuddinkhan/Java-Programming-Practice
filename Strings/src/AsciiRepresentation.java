public class AsciiRepresentation {

    public static String Convert(String num){
       String result="";
       for(int  i = 0; i<num.length() ; i++){
           char ch = num.charAt(i);
           int ascii =(int) ch;
           result = result+ascii+" ";
       }

       return result;
    }

    public static void main(String[] args) {
        System.out.println(Convert("HELLO"));
    }
}
