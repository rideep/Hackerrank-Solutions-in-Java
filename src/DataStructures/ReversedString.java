package DataStructures;

class StackString{
	int size;
	int top;
	char a[];
	
	public StackString(int n)
	{
		top=-1;
		size=n;
		a=new char[size];
	}
	
	public boolean IsEmpty() {
		if(top<0)
			return true;
		else
			return false;
	}
	public boolean push(char x) {
		if(top>=size)
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
	char pop()
	{
		 
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return 0;
		}
			
		else
		{
			
			char x= a[top--];
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
}

public class ReversedString {

	/**
	 * @param args
	 */
	public static void StringReversed(StringBuffer str)
	{
		int n=str.length();
		StackString ob=new StackString(n);
		
		for(int i=0;i<n;i++)
		{
			ob.push(str.charAt(i));
		}
		for(int i=0;i<n;i++)
		{
			char ch=ob.pop();
			str.setCharAt(i, ch);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Rideep");
		StringReversed(s);
		System.out.println(s);
	}

}
