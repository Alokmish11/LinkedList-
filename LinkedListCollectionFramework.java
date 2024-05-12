import java.util.LinkedList;

public class LinkedListCollectionFramework {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.removeFirst();
        
        System.out.println(ll);
    }
    
}
