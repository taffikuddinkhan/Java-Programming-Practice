class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Stack_impl_using_linkedlist {

    Node top = null;


    public void push(int data){

        Node node = new Node(data);

        node.next = top;
        top = node;

        System.out.println("Successfully added " + data);
    }


    public void pop(){

        if(top == null){
            System.out.println("Stack is already empty!");
            return;
        }

        System.out.println("Successfully deleted element " + top.data);
        top = top.next;
    }


    public void display(){

        if(top == null){
            System.out.println("Stack is empty!");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements (Top to Bottom):");

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Stack_impl_using_linkedlist stack = new Stack_impl_using_linkedlist();

        stack.push(10);
        stack.push(15);
        stack.push(20);

        stack.display();

        stack.pop();
        stack.display();
    }
}