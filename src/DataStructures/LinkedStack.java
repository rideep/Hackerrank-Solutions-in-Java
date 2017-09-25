package DataStructures;

public class LinkedStack {
	Node top=null;
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public boolean isEmpty() {
		return top==null;
	}
	public void push(int x) {
		if(isEmpty()){
			Node new_node =new Node(x);
			top=new_node;
		}
		else{
			Node new_node =new Node(x);
			new_node.next=top;
			top=new_node;
		}
	}
	public void pop()
	{
		if(isEmpty())
			System.out.println("the stack is empty");
		else{
			top=top.next;
		}
	}
	public void display()
	{
		if(isEmpty())
			System.out.println("the stack is empty");
		else
		{
			while(top!=null)
			{
				System.out.println(top.data);
				top=top.next;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack Stack=new LinkedStack();
		
		Stack.push(20);
		Stack.push(13);
		Stack.push(21);
		Stack.push(19);
		Stack.pop();
		Stack.display();
		
	}

}
