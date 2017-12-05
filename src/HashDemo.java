import java.util.Hashtable;


public class HashDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h = new Hashtable();
        
        Hashtable h1 = new Hashtable();
          
        h.put(3, "Geeks");
        h.put(2, "forGeeks");
        h.put(1, "isBest");
        h.put("tweener", new Integer(345));  
        // create a clone or shallow copy of hash table h
        h1 = (Hashtable)h.clone();
          System.out.println(h);
        // checking clone h1
        System.out.println("values in clone: " + h1);
          
        // clear hash table h
        //h.clear();
          System.out.print(h.containsValue(345));
        // checking hash table h
        //System.out.println("after clearing: " + h); 
	}

}
