import java.util.LinkedList;

public class ZigZagLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
         head=tail=newNode;
         return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // print LL
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void zigzag(){
        // find middle
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
    
             slow =slow.next; 
             fast=fast.next.next;
    }
    Node mid=slow;

    // revese 2nd half
   Node curr=mid.next;
   mid.next=null;
   Node prev=null;
   Node next;

   while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
   }

   Node left=head;
   Node right=prev;
   Node nextLeft,nextRight;

   // alt merge- zig-zag

   while(left!=null && right!=null){
    nextLeft=left.next;
    left.next=right;
    nextRight=right.next;
    right.next=nextLeft;
    left=nextLeft;
    right=nextRight;

   }
    
}
public static void main(String[] args){
    ZigZagLL ll= new ZigZagLL();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    ll.print();
    ll.zigzag();
    ll.print();

}
}