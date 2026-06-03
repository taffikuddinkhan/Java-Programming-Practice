
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head = null;

    public void inser_at_begin(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }


        node.next = head;
        head = node;
    }

    public void insert_at_position(int data,int position){
        Node node = new Node(data);
        if(position == 1){
            inser_at_begin(data);
        }

        Node temp = head;

        for(int i = 1 ; i<position-1 && temp.next != null ; i++){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println(" Invalid position ");
            return;
        }

        node.next = temp.next;
        temp.next = node;

    }

    public void print_list(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }

        System.out.print("null");
    }

    public void insert_at_end(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        Node temp = head;

        while(temp.next != null){

            temp = temp.next;
        }

        temp.next = node;
        temp = null;
    }

    public void delete_at_begin(){
        if(head == null){
            System.out.println("The list is empty");
        }

        head = head.next;
    }

    public void delete_by_value(int value){

        if(head.data == value){
            head = head.next;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("The Value " + value + " was not found in the List !");
            return;
        }

        temp.next = temp.next.next;

    }

    public void delete_at_end(){

        if(head == null){
            System.out.println("List is empty ");
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;

    }

    public void reverslist(){

        if(head == null){
            System.out.println("List is empty !");
        }
        if(head.next == null){
            return;
        }
        Node previous = head;
        Node current = head.next;

        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head.next = null;
        head = previous;
    }



    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.inser_at_begin(10);
        list.insert_at_end(20);
        list.insert_at_end(30);
        list.insert_at_end(40);
        list.insert_at_position(25,3);


        list.print_list();
        System.out.println(" ");
        list.reverslist();


//        list.delete_at_begin();
//        list.delete_by_value(300);
//        list.delete_at_end();



        list.print_list();



    }


}
