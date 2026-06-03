import java.util.LinkedList;

class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class NumberofNodes {

    public static int countnodes(Node1 head){

        int count = 0;
        if(head == null){
            return count;
        }

        Node1 temp = head;
        while(temp!= null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static int findMid(Node1 head){

        Node1 slow = head;
        Node1 fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void display(Node1 head){
        if(head == null){
            System.out.println("empty list");
        }
        Node1 temp = head;
        while( temp!= null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static Node1 reverse(Node1 head){

        Node1 prev = null;
        Node1 current = head;

        while(current != null){

            Node1 next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Node1 head = new Node1(10);
        head.next = new Node1(20);
        head.next.next = new Node1(30);
        head.next.next.next = new Node1(40);
        head.next.next.next.next = new Node1(50);
//        System.out.println(countnodes(head));
//        System.out.println(findMid(head));
        head = reverse(head);
        display(head);
    }
}
