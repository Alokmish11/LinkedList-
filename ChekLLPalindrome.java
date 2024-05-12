public class ChekLLPalindrome {
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
   // public static int size;

    // AddFirst in LL
    
    public void addElement(int data){
        Node newNode=new Node(data);
      //  size++;
        if(head==null){
         head=tail=newNode;
         return;
        }
        newNode.next=head;
        head=newNode;
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

    // slow-fast Approach

    public Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
    
             slow =slow.next; //// +1
             fast=fast.next.next;  // +2

        }
        return slow;
    }
    public boolean chekPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // find middle

        Node mid=middle(head);
    //}
    // Reverse 2nd half

    Node prev=null;
    Node curr=mid;
    while(curr!=null){
        Node next= curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev;
    Node left=head;

    // chek if equal

    while(right!=null){
        if(left.data!=right.data){
            return false;
    }
    
        left=left.next;
        right=right.next;
    }
    return true;  
}
public static void main(String[] args){
    ChekLLPalindrome   ll= new ChekLLPalindrome();
    ll.addElement(1);
    ll.addElement(2);
    ll.addElement(2);
    ll.addElement(1);

    ll.print();
    System.out.println(ll.chekPalindrome());
}
}