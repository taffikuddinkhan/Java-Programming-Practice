import java.util.*;
import java.util.LinkedList;

public class Collection_Linkedlist {

    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList();
        list.add(10);
        list.addLast(20);
        list.addFirst(5);


        for(int i = 0 ; i<list.size() ; i++){
            System.out.print(list.get(i) + " → ");

        }
        System.out.print("Null");
//        System.out.println(list);

    }
}
