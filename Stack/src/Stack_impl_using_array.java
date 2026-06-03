
class Stack{
    int arr[];
    int top;
    int capacity;

    Stack(int size){
        arr = new int [size];
        top = -1;
        capacity = size;
    }

    public void push(int value){
        if(top == capacity-1){
            System.out.println("Stack is already full , can't perform push operation ! ");
            return ;
        }

        top++;
        arr[top] = value;
        System.out.println("Sucessfully pushed "+value+" in to the stack ");
    }

    public void pop(){
        if(top == -1){
            System.out.println("The stack is already empty ! ");
            return;
        }

        System.out.println("Sucessfully removed "+ arr[top]);
        top--;
    }

    public void peek(){
        if(top == -1){
            System.out.println("No elements present in the Stack ! ");
            return;
        }

        System.out.println("The top element is " + arr[top]);
    }

    public void print(){
        System.out.println("Stack values from top to bottom : ");
        for(int i = top ; i>=0 ; i--){
            System.out.println(arr[i] + " ");
        }
    }

}


public class Stack_impl_using_array {



    public static void main(String[] args) {

        Stack stack = new Stack(3);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.peek();
        stack.print();

    }
}
