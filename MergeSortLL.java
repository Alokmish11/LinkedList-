public class MergeSortLL {
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
    public Node mergeSort(Node head){
        if(head==null && head.next!=null){
            return head;
        }
        public Node getmid(Node head){

             Node slow=head;
             Node fast=head;
             while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
             }
             public Node mergeSort(Node head1, Node head2){
                Node mergeLL= new Node(-1);
                while(head1!=null && head2!=null){
                    if(head1.data<=head2.data){
                        temp.next=head1;
                        head1=head1.next;
                        temp=temp.next;
                    }else{
                        temp.next=head2;
                        head2=head2.next;
                        temp=temp.next;
                    }
                 }
                 while(head1!=null){
                    temp.next=head1;
                        head1=head1.next;
                        temp=temp.next;
                 }
                 while(head2!=null){
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                 }
                 return mergeLL.next;
             }
             public Node mergeSort(Node head){
                if(head==null || head.next==null){
                    return head;
                }
                // find mid
                Node mid=getmid(head){
                    // lest && right mergesort
                    Node rightHead=mid.next;
                    mid.next=null;

                    Node newleft=mergeSort(head);
                    Node newright=mergeSort(rightHead);
                    // merge

                    return merge(newleft,newright);
                }
             }
             public static void main(String[] args){
                Linkedlist ll= new Linkedlist ();
                ll.addfirst(1);
                ll.addfirst(2);
                ll.addfirst(3);
                ll.addfirst(4);
                ll.addfirst(5);
                ll.print();
                ll.head=ll.mergeSort(ll.head);
                ll.print();

             }
        }
    }
    
}
