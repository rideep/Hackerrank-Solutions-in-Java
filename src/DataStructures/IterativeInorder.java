package DataStructures;
import java.util.Stack;

class TreeNode{
	int data;
	TreeNode left,right;
	public TreeNode(int data) {
		this.data=data;
		left=right=null;
	}
}
class BinaryTreeTraverse{
	TreeNode root;
	void inorder()
	{
		if(root==null)
			return;
		Stack<TreeNode> stack =new Stack<TreeNode>();
		TreeNode current_node=root;
		while(current_node!=null)
		{
			stack.push(current_node);
			current_node=current_node.left;
		}
		while(stack.size()>0)
		{
			TreeNode popped=stack.pop();
			System.out.println(popped.data);
			current_node=popped.right;
			while(current_node!=null)
			{
				stack.push(current_node);
				current_node=current_node.left;
			}
		}
	}
	void preOrder()
	{
		if(root==null)
			return;
		TreeNode current=root;
		Stack<TreeNode> s =new Stack<TreeNode>();
		s.push(root);
		while(s.size()>0)
		{
			TreeNode popped=s.pop();
			System.out.println(popped.data);
			if(popped.right!=null)
				s.push(popped.right);
			if(popped.right!=null)
				s.push(popped.left);
		}
	}
	void PostOrder()
	{
		if(root==null)
			return;
		TreeNode current=root;
		Stack<TreeNode> s1,s2;
		s1=new Stack<TreeNode>();
		s2=new Stack<TreeNode>();
		s1.push(current);
		while(s1.size()>0)
		{
			TreeNode popped=s1.pop();
			s2.push(popped);
			if(popped.left!=null)
				s1.push(popped.left);
			if(popped.right!=null)
				s1.push(popped.right);
		}
		while(!s2.isEmpty())
		{
			TreeNode node=s2.pop();
			System.out.println(node.data);
		}
		
	}
}
public class IterativeInorder {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeTraverse tree = new BinaryTreeTraverse();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.inorder();
        System.out.print("PreOrder Traversal is::");
        tree.preOrder();
        System.out.print("PostOrder Traversal is::");
        tree.PostOrder();
	}

}
