
import java.util.*;

//import DataStructures.LinkedList.Node;
public class MergeSortList {
	static Node head;
	public static class Node
	{
		
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	
		public void push(int new_data) {
			 Node new_node=new Node(new_data);
			 new_node.next=head;
			 head=new_node;
		}
		
			
	}
	public static Node MergeSort(Node a,Node b)
	{
		Node res=null;
		if(a==null)
			return b;
		else if(b==null) 
			return a;
		if(a.data<=b.data)
		{
			res=a;
			res.next=MergeSort(a.next, b);
		}
		else 
		{
			res=b;
			res.next=MergeSort(a, b.next);
		}
		return res;
	}	
	


	public static void main(String[] args) {
		Node a=new Node(0);
		Node b=new Node(0);
		Node res=new Node(0);
		a.push(0);
		a.push(4);
		a.push(10);
		b.push(1);
		b.push(5);
		b.push(3);
		res=(MergeSort(a, b));
		System.out.print(res);
	}
}    



