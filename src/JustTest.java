
public class JustTest {


		  public static int power(int x, long y)
		{
		    int res = 1;     // Initialize result
		  
		    while (y > 0)
		    {
		        // If y is odd, multiply x with result
		        if ((y&1)==1)
		        
		        	
		        	res = res*x;
		      
		            
		        	
		        // n must be even now
		        y = y>>1; // y = y/2
		        x = x*x;  // Change x to x^2
		    }
		    return res;
		} 
		    public static void main(String[] args) {
		    int x = 2;
		   int y = 5;
		   System.out.println(power(x, y));
		   
		    }
		}
	


