
/*The span Si of the stock’s price on a given day i is defined as the 
 * maximum number of consecutive days just before the given day, for 
 * which the price of the stock on the current day is less than or equal 
 * to its price on the given day.
For example, if an array of 7 days prices is given as 
{100, 80, 60, 70, 60, 75, 85}, 
then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}

*/
import java.util.Scanner;
import java.util.Stack;
public class StockSpan {
/* method to calculate Stock Span using Stack
 * 
 */
	public static void Span(int S[],int n,int price[]) {
		//Stack for storing  indices of prices
		Stack<Integer> s=new Stack<Integer>();
		s.push(0);
		S[0]=1;
		for(int i=1;i<n;i++)
		{
			/*if the price of previous is less than pop that index
			 * 
			 */
			while(!s.isEmpty() && price[s.peek()]<=price[i])
				s.pop();
			/*if the stack is empty than all the elements are
			 * smaller than current if not than it is greater than
			 * all elements to the top.
			 */
			S[i]=s.isEmpty()?i+1:i-s.peek();
			//push the current element
			s.push(i);
		}
	}
	
	public static void main(String[] args) {
		int price[]={10, 4, 5, 90, 120, 80};
		int n =price.length;
		int S[]=new int[n];
	
		Span(S,n,price);
		for(int i=0;i<n;i++)
		{
			System.out.print(S[i]+"\t");
		}
	}

}
