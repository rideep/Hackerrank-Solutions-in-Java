package DataStructures;

 class Stack {
			public static final int MAX=100;
			int top;
			int a[]=new int[MAX];
			public boolean IsEmpty() {
				if(top<0)
					return true;
				else
					return false;
			}
			public boolean push(int x) {
				if(top>=MAX)
				{
					System.out.println("Stack is Overflow");
					return false;
				}
				else 
				{
					a[++top]=x;
					return true;
				}
			}
			int pop()
			{
				 
				if(top==-1)
				{
					System.out.println("Stack is empty");
					return 0;
				}
					
				else
				{
					
					int x= a[top--];
					return x;
				}			
			}
			void display()
			{
				if(top==-1)
					System.out.println("Stack is empty");
				else
				{
					for(int i=top;i>0;i--)
					{
						System.out.println(a[i]);
					}
				}
				
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(20);
		stack.push(79);
		stack.push(29);
		stack.push(21);
		stack.display();
		System.out.println("The element popped is"+ stack.pop());
		stack.display();
	}

}
