package DataStructures;

class NODE{
	int data;
	NODE left,right;
	public NODE(int data) {
		this.data=data;
		left=right=null;
		// TODO Auto-generated constructor stub
	}
}
class BinTree
{
	NODE root;
	public BinTree(){
		root=null;
	}
	public void printLevelOrder(){
		int h=height(root);
		for (int i = 0; i <= h; i++) {
			printGivenOrder(root,i);
			System.out.print("\n");
		}
	}
	int height(NODE root)
	{
		if(root==null)
			return 0;
		int lheight =height(root.left);
		int rheight =height(root.right);
		if(lheight>rheight)
			return lheight+1;
		else 
			return rheight+1;
	}
	public void printGivenOrder(NODE root,int level) {
		if(root==null)
			return;
		else if(level==1)
			System.out.print(root.data+" ");
		else if(level>1)
		{
			printGivenOrder(root.left, level-1);
			printGivenOrder(root.right, level-1);
		}
		
		
	}
}
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree b=new BinTree();
		b.root= new NODE(1);
	       b.root.left= new NODE(2);
	      b.root.right= new NODE(3);
	       b.root.left.left= new NODE(4);
	       b.root.left.right= new NODE(5);
	       b.printLevelOrder();
	}

}
