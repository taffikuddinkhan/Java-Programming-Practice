import java.util.Stack;

public class NextGreater {

    public static void Nextgreater(int arr[] , Stack<Integer> st){
        int answer = -1 ;

        for(int i = 0 ; i<arr.length-1 ; i++ ){
            if(arr[i] < arr[i+1]){
                answer = arr[i+1];
                st.push(answer);
            }
            else {
                st.push(-1);
            }
        }
        while(!st.isEmpty()){
            answer = st.pop();
            System.out.print(answer+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {4,5,2,10,8};
        Nextgreater(arr,st);
    }
}
