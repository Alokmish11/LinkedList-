public class ReverseDLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode= new Node(data);
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");

        }
    public void reverse(){
        Node currnt= head;
        Node prev=null;
        Node next;
        while(currnt!=null){
            next=currnt.next;
            currnt.next=prev;
            currnt.prev=next;
            prev=currnt;
            currnt=next;
        }
        head=prev;

    }
    public static void main(String[] args){
        ReverseDLL ll= new ReverseDLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();
    }
    
}
