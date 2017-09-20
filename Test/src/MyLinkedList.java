
public class MyLinkedList {
	
	 Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int d){
			
			data=d;
			next=null;			
		}
	}
	
	public Node findLastNode()
	{
		Node node=head;
		
		
		if(head!=null)
		{
			while(node!=null)
			{
				node=node.next;
			}
			
			return node;
		}
		return null;
	}
	public void addNode(int d){	
		if(head==null)
		{
			head=new Node(d);
			head.next=null;
		}
		else{
			Node newNode =new Node(d);
			Node lastNode =findLastNode();
			lastNode.next =newNode;
		}
		
				
	}
	
	int detectAndRemoveLoop(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
 System.out.println("slow is" +slow.data+"fast is" +fast.data);
            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                removeLoop1(slow, node);
                return 1;
            }
        }
        return 0;
    }
	Node reverseUtil(Node curr, Node prev) {
		 
        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;
 
            /* Update next to prev node */
            curr.next = prev;
            return null;
        }
 
        /* Save curr->next node for recursive call */
        Node next1 = curr.next;
        
 
        /* and update next ..*/
        curr.next = prev;
 
        reverseUtil(next1, curr);
        return head;
    }
	void removeLoop1(Node soft, Node head) {
		Node previous=soft;
		while(soft!=null&& head!=null)
		{
			
			if(soft==head){
				System.out.println("before break: "+soft.data);
            System.out.println("before break: "+head.data);
				break;}
			else
				previous =soft;
				soft=soft.next;
				head=head.next;
		}
		System.out.println("before setting null"+previous.data);
		previous.next=null;
		
	}
	 // Function to remove loop
    void removeLoop(Node soft, Node head) {
        Node head1 = null, soft1 = null;
 
        /* Set a pointer to the beging of the Linked List and
         move it one by one to find the first node which is
         part of the Linked List */
        head1 = head;
        while (1 == 1) {
 
            /* Now start a pointer from loop_node and check if it ever
             reaches ptr2 */
            soft1 = soft;
            while (soft1.next != soft && soft1.next != head1) {
                soft1 = soft1.next;
                System.out.println("inside soft1 loop: "+soft1.data);
                System.out.println("inside soft1 loop: "+head1.data);
            }
 
            /* If ptr2 reahced ptr1 then there is a loop. So break the
             loop */
            if (soft1.next == head1) {
            	System.out.println("before break: "+soft1.data);
                System.out.println("before break: "+head1.data);
                break;
            }
 
            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
            head1 = head1.next;
            System.out.println("outside the second while loop"+head1.data);
        }
 
        /* After the end of loop ptr2 is the last node of the loop. So
         make next of ptr2 as NULL */
        System.out.println("just before setting next null: "+soft1.data);
        soft1.next = null;
    }
 
    // Function to print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
   
   public void printLinkedList()
   {
	   Node node =head;
	   if(head!=null)
	   {
		   while(node!=null)
		   {
			   System.out.println(node.data);
			   node=node.next;
			   
		   }
	   }
	   else 
	   System.out.println("List is Empty");
   }
   
   public void swap(int x, int y, Node node)
   {
	   Node currX=null;
	   Node currY=null;
	   Node PrevX=null;
	   Node PrevY=null;
	   Node Prev=null;
	   Node nextX=null;
	   Node nextY=null;
	   boolean xpoint=false;
	   boolean ypoint=false;
	   if (node!=null&&!(xpoint&&ypoint))
	   {
		 while(node.next!=null)
		   {
			   if(node.data==x)
			   {
				   currX=node;
				   xpoint=true;
				   PrevX=Prev;
			   }
			   if(node.data==y)
			   {
				   currY=node;
				   ypoint=true;
				   PrevY=Prev;
			   }
			   Prev=node;
			   node=node.next;
		   }
		 if(currX!=null&&currY!=null)
		 {
			 nextX=currX.next;
			// System.out.println("nextx "+nextX.data);
			 nextY=currY.next;
			// System.out.println("nexty "+nextY.data);
			 PrevX.next=currY;
			// System.out.println("prevX .next "+PrevX.next.data);
			 PrevY.next=currX;
			// System.out.println("prevY .next "+PrevY.next.data);
			 PrevX.next.next=nextX;
			// System.out.println("prevX .next.next "+PrevX.next.next.data);
			 PrevY.next.next=nextY;
			// System.out.println("prevY .next.next "+PrevY.next.next.data);
			 
		 }
	   }
	   else
		   System.out.println("Nothing to swap");
	   
   }
   
   


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList list = new MyLinkedList();
		for(int i=1;i<=20;i++)
		{
			list.addNode(i);
		}
		//list.findLastNode().next=list.head.next.next.next.next.next.next.next;
        //list.head = new Node(50);
       // list.head.next = new Node(20);
       // list.head.next.next = new Node(15);
       // list.head.next.next.next = new Node(4);
       // list.head.next.next.next.next = new Node(10);
        //System.out.println(head.next.next.next.next.next.data);
        // Creating a loop for testing 
       // head.next.next.next.next.next = head.next.next;
        
//        list.detectAndRemoveLoop(list.head);
//        list.printLinkedList();
//        list.swap(5, 10, list.head);
//        list.printLinkedList();
		System.out.println(list.findLastNode().data);

	}

}
