import java.util.Scanner;
import java.util.Stack;


public class CheckParenthesis {
	private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';
    private static final char L_BRACE    = '{';
    private static final char R_BRACE    = '}';
    private static final char L_BRACKET  = '[';
    private static final char R_BRACKET  = ']';

	public static boolean isBalanced(String str) {
		Stack<Character> S=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==L_PAREN)
				S.push(L_PAREN);
			else if(str.charAt(i)==L_BRACE)
				S.push(L_BRACE);
			else if(str.charAt(i)==L_BRACKET)
				S.push(L_BRACKET);
			else if(str.charAt(i)==R_PAREN)
			{
				if(S.isEmpty())
					return false;
				else if(S.pop()!=L_PAREN)
					return false;
			}
			else if(str.charAt(i)==R_BRACE)
			{
				if(S.isEmpty())
					return false;
				else if(S.pop()!=L_BRACE)
					return false;
			}
			else if(str.charAt(i)==R_BRACKET)
			{
				if(S.isEmpty())
					return false;
				else if(S.pop()!=L_BRACKET)
					return false;
			}
		}
		return S.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.next();
		if(isBalanced(str))
			System.out.print("Balanced");
		else
			System.out.print("Unbalanced");
	}

}
