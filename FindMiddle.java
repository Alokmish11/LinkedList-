import java.util.*;

public class FindMiddle {
	Node head; 
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public void printMiddle()
	{
		Node slow_ptr = head;
		Node fast_ptr = head;

		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		System.out.println("The middle element is ["
						+ slow_ptr.data + "] \n");
	}
      

	// Add node
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);

		new_node.next = head;
		head = new_node;
	}

	// print linkedlist
	
	public void printList()
	{
		Node tempnode = head;
		while (tempnode != null) {
			System.out.print(tempnode.data + "->");
			tempnode = tempnode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args)
	{
		FindMiddle ll = new FindMiddle();
		ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
		ll.push(1);
			ll.printList();
			ll.printMiddle();
		
		}
	}


