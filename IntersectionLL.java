public class IntersectionLL {
    static class Node { 
        int data; 
        Node next;
       public Node(int data){ 
              this.data = data;
              this.next = null;
        }
    }

    public Node getIntersectionNode(Node head1, Node head2){
        while (head2 != null) { 
            Node temp = head1; 
            while (temp != null) { 
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
    }
          head2 = head2.next; 

}  return null;
    }
    public static void main(String[] args){
        IntersectionLL list = new IntersectionLL();
        Node head1, head2; 
        head1 = new Node(4);
        head2 = new Node(1); 
        Node newNode = new Node(5); 
        head2.next = newNode;
        newNode = new Node(2); 
        head2.next.next = newNode;
        head2.next.next = newNode;
        newNode = new Node(3); 
        head1.next = newNode; 
        head2.next.next.next = newNode;

        newNode = new Node(6);
        head2.next.next.next.next = newNode;
        newNode = new Node(7);

        head2.next.next.next.next.next = null;

        Node intersectionPoint= list.getIntersectionNode(head1, head2);
       if (intersectionPoint == null) {
       System.out.print(" No Intersection Point \n");

    } else {
        System.out.print("Intersection Point: " + intersectionPoint.data);
        
    }

    }

}

    
