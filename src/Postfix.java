import java.util.Stack;
public class Postfix {

	static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
	static String InfixPostfix(String str)
	{
		String P=new String("");
		Stack<Character> s=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				P+=c;
			}
			else if(c=='(')
				s.push(c);
			else if(c==')')
			{
				while(!s.isEmpty() && s.peek()!='(')
				{
					P+=s.pop();
				}
				if(!s.isEmpty() && s.peek()!='(')
					return "Invalid Expression";
				else
					s.pop();
			}
			else
			{
				while(!s.isEmpty() && Prec(c)<=Prec(s.peek()))
					P+=s.pop();
				s.push(c);
			}
			
			
		}
		/*
		while (!s.isEmpty())
            P += s.pop();
            */
		return P;
		
	}
	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(InfixPostfix(exp));

	}

}
