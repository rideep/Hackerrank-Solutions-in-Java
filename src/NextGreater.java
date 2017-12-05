import java.util.Stack;

public class NextGreater {
	public static void FindNext(int a[]) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(a[0]);
		int result[]=new int[a.length];
		for(int i=1;i<a.length;i++)
		{
			int next=a[i];
			if(!stack.isEmpty())
			{
				int element=stack.pop();
				while(element<next)
				{
					System.out.println(element+"-->"+next);
					if(stack.isEmpty())
						break;
					element=stack.pop();
				}
				if(element>next)
					stack.push(element);
			}
			stack.push(next);
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop()+"-->"+-1);
		}
	}
	public static void main(String[] args) {
		int arr[] = { 11, 13, 21, 3 };
		FindNext(arr);
	}

}
