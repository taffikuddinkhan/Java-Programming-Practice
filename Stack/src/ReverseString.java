import java.util.Stack;

public class ReverseString {

    public static void reverse(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {

        reverse("HELLO");

    }
}
