package DataStructures;

public class LinkedList {
	static Node head;
	 public class Node
	 {
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	 //function to insert at first node
	 public void push(int new_data) {
		 Node new_node=new Node(new_data);
		 new_node.next=head;
		 head=new_node;
	}
	 //function to insert after a given node
	 public void insertAfter(Node prev_node,int new_data)
	 {
		 if(prev_node==null)
		 {
			 System.out.print("The Previous node cannot be null");
		 }
		 Node new_node=new Node(new_data);
		 new_node.next=prev_node.next;
		 prev_node.next=new_node;
	 }
	 //function to insert at last
	 public void append(int new_data)
	 {
		
		 Node new_node=new Node(new_data);
		 
		 if(head==null)
		 {
			 head=new Node(new_data);
			 return;
		 }
		 new_node.next=null;
		 Node last=head;
		 while(last.next!=null)
		 {
			 last=last.next;
		 }
		 last.next=new_node;
		 return;
		 
	 }
	 
	 public void deleteNode(int key)
	 {
		 Node temp=head;
		 Node prev=null;
		 if(temp!=null && temp.data==key)
		 {
			 head=temp.next;
			 return;
		 }
		 while(temp!=null && temp.data!=key)
		 {
			 prev=temp;
			 temp=temp.next;
		 }
		 prev.next=temp.next;
		 return;
	 }
	 public void deleteNodeAt(int position) {
		 Node temp=head;Node prev=null;
		 if(position==0)
		 {
			 head=temp.next;
			 return;
		 }
		 for(int i=0;i<position;i++)
		 {
			 prev=temp;
			 temp=temp.next;
		 }
		 prev.next=temp.next;
		 return;
	}
	 public int findLength()
	 {
		 int count=0;
		 Node p=head;
		 while(p!=null)
		 {
			 p=p.next;
			 count++;
		 }
		 return count;
	 }
	 public int Size(Node head) {
		 if(head==null)
			 return 0;
		
		return 1 + Size(head.next);
	}
	 /*
	 public int SizeRec() {
		return Size(head);
	}
	*/
	 public boolean findElement(int key) {
		 Node current=head;
		 while(current!=null)
		 {
			 if(current.data==key)
			 {
				 return true;
			 }
			 current=current.next;
		 }
		return false;
	}
	 public boolean RecSearch(Node head,int key) {
		 if(head==null)
			 return false;
		 else if(head.data==key)
			 return true;
		 else
			 return RecSearch(head.next,key);
		
	}
	
	 public void swapNodes(int x,int y)
	 {
		 Node tempX=head, prevX=null;
		 while(tempX != null && tempX.data != x)
		 {
			 prevX=tempX;
			 tempX=tempX.next;
		 }
		 
	     
		 Node tempY=head;Node prevY=null;
		 while(tempY != null && tempY.data != y)
		 {
			 prevY=tempY;
			 tempY=tempY.next;
		 }
		 if(tempX==null || tempY==null)
		 {
			 System.out.println("NOt presnt");
		 }
		 if(prevX != null)
			 prevX.next=tempY;
		 else
			 head=tempY;
		 
		 if(prevY != null)
			 prevY.next=tempX;
		 else
			 head=tempX;
		 
		 
		 Node temp1=tempX.next;
		 tempX.next=tempY.next;
		 tempY.next=temp1;
		
	 }
	public Node reverseList(Node node) {
		Node current=node;
		Node prev=null;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node = prev;
		return node;
	}
	public Node RecursiveRev(Node head)
	{
		//Node first;
		Node rest;
		if(head==null || head.next==null)
			return head;
		//first=node;
		rest=head.next;
		
		Node reverse=RecursiveRev(rest);
		head.next.next=head;
		head.next=null;
		return reverse;
		//return node;
	}
	 /*
	 public void swapNodes(int x, int y)
	    {
	        // Nothing to do if x and y are same
	        if (x == y) return;
	 
	        // Search for x (keep track of prevX and CurrX)
	        Node prevX = null, currX = head;
	        while (currX != null && currX.data != x)
	        {
	            prevX = currX;
	            currX = currX.next;
	        }
	 
	        // Search for y (keep track of prevY and currY)
	        Node prevY = null, currY = head;
	        while (currY != null && currY.data != y)
	        {
	            prevY = currY;
	            currY = currY.next;
	        }
	 
	        // If either x or y is not present, nothing to do
	        if (currX == null || currY == null)
	            return;
	 
	        // If x is not head of linked list
	        if (prevX != null)
	            prevX.next = currY;
	        else //make y the new head
	            head = currY;
	 
	        // If y is not head of linked list
	        if (prevY != null)
	            prevY.next = currX;
	        else // make x the new head
	            head = currX;
	 
	        // Swap next pointers
	        Node temp = currX.next;
	        currX.next = currY.next;
	        currY.next = temp;
	    }
	    */
	 public void showlist()
	 {
		 Node p=head;
		 while(p!=null)
		 {
			 System.out.println(p.data);
			 p=p.next;
		 }
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.push(30);
		list.push(5);
		list.push(4);
		list.append(20);
		
		list.showlist();
		/*
		list.insertAfter(list.head, 6);
		list.insertAfter(list.head, 9);
		list.append(10);
		list.showlist();
		*/
		//list.deleteNodeAt(4);
		//int count=list.Size(list.head);
		//System.out.println("The list is of length::"+count);
		//boolean Ispresent=list.RecSearch(list.head, 30);
		//System.out.println(Ispresent);
		//head=list.reverseList(head);
		head=list.RecursiveRev(head);
		//head=list.reverseList(head);
		list.showlist();
	}

}
