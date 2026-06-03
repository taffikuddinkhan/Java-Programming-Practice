
class Queue{
    int arr[];
    int front;
    int rear;

    Queue(int size){
        arr = new int[size];
        rear = -1;
        front = -1;
    }

    public void enque(int data){

        if (rear == arr.length-1) {
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front++;
        }

        rear ++;
        arr[rear] = data;
        System.out.println(" Element added ");

    }

    public void deque(){
        if(front == -1){
            System.out.println("Queue is already empty ! ");
            return;
        }
        System.out.println("The element " + arr[front] + " deleted ");
        front++;
        if(front > rear){
            front = -1;
            rear = -1;
        }
    }

    public void peek(){
        if(front == -1){
            System.out.println("Queue is already empty ! ");
            return;
        }

        System.out.println("The peek element is " + arr[front]);
    }

    public void display(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front ; i<=rear ; i++){
            System.out.print(arr[i]  + " ");
        }
    }
}


public class Queue_impl_using_arr {

    public static void main(String[] args) {

        Queue queue = new Queue(5);
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.deque();
        queue.peek();
        queue.display();

    }
}
