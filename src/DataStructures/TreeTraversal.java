package DataStructures;

class TNode{
	int data;
	TNode left,right;
	public TNode(int data) {
		this.data=data;
		left=right=null;
		// TODO Auto-generated constructor stub
	}
}
class BinaryTree{
	 TNode root;
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	void PrintInOder(TNode node)
	{
		if(node ==null)
			return;
		//Recursion on left subtree of node
		PrintInOder(node.left);
		
		//Get the node
		System.out.println(node.data);
		//Recursion on right subtree of node
		PrintInOder(node.right);
	}
	void PrintPreOder(TNode root)
	{
		if(root ==null)
			return;
		//Get the node
				System.out.println(root.data);
		//Recursion on left subtree of node
		PrintInOder(root.left);
		//Recursion on right subtree of node
		PrintInOder(root.right);
	}
	void PrintPostOder(TNode node)
	{
		if(node ==null)
			return;
		//Recursion on left subtree of node
		PrintInOder(node.left);
		//Recursion on right subtree of node
				PrintInOder(node.right);
		//Get the node
		System.out.println(node.data);
		
	}
	
	void PrintInOder()
	{
		PrintInOder(root);
	}
	
	void PrintPreOder()
	{
		PrintPreOder(root);
	}
	void PrintPostOder()
	{
		PrintPostOder(root);
	}
}
public class TreeTraversal {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b=new BinaryTree();
		b.root=new TNode(1);
		b.root.left=new TNode(2);
		b.root.right=new TNode(3);
		b.root.left.left=new TNode(4);
		b.root.left.right=new TNode(5);
		System.out.println("InOrder Traversal is:: ");
		b.PrintInOder();
		System.out.println("PreOrder Traversal is:: ");
		b.PrintPreOder();
		System.out.println("PostOrder Traversal is:: ");
		b.PrintPostOder();
		
	}

}
