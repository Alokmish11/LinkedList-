public class DeleteNthFromEnd {
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
    public static int size;

    // AddFirst in LL
    public void addElement(int data){
        Node newNode=new Node(data);
        size++;
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

    // (size-n+1) from beging=delete nth frm end
    public void Delete(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;  // DeleteFirst
            return;
        }
        // size-n
        int i=1;
        int indxToFind=size-n;
        Node prev=head;
        while(i<indxToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args){
        DeleteNthFromEnd ll= new  DeleteNthFromEnd();
        ll.addElement(4);
        ll.addElement(3);
        ll.addElement(2);
        ll.addElement(1);
        ll.print();
        ll.Delete(2);
        ll.print();
    }
}
