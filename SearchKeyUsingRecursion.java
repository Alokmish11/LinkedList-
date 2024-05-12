public class SearchkeyUsingRecursion{
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
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
         head=tail=newNode;
         return;
        }
        newNode.next=head;
        head=newNode;
    }

    // AddLast in LL
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
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
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx= helper(head.next,key);
        if(idx== -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args){
        SearchkeyUsingRecursion ll=new SearchkeyUsingRecursion();
        //ll.print();
        ll.addFirst(2);
       // ll.print();
        ll.addFirst(1);
       // ll.print();
        ll.addLast(4);
       // ll.print();
        ll.addLast(5);
        ll.print();
        System.out.println(" key is found at idx : "  +ll.recSearch(2));

    }
}
