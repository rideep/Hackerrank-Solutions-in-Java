package DataStructures;

public class MaxHeap {
 int a[];
	int capacity,heapsize;
	MaxHeap(int capacity)
	{
		this.capacity=capacity;
		heapsize=0;
		a=new int[capacity];
	}
	int parent(int i)
	{
		return (i-1)/2;
	}
	int left(int i)
	{
		return (2*i)+1;
	}
	int right(int i)
	{
		return (2*i)+2;
	}
	void insertKey(int key)
	{
		if(heapsize==capacity)
		{
			System.out.println("Overflow");
			return;
		}
			
		heapsize++;
		int i=heapsize-1;
		a[i]=key;
		//MaxHeapify(i);
		
		while(i>0 && a[parent(i)]<a[i])
		{
			
			//swap(a[i],a[parent(i)]);
			int temp = a[i];
			a[i] = a[parent(i)];
			a[parent(i)]=temp;
			i=parent(i);
		}
		
	}
	void MaxHeapify(int i)
	{
		int largest=i;
		int l=left(i);
		int r=right(i);
		if(l<heapsize && a[l]>a[i])
			largest=l;
		
		if(r<heapsize && a[r]>a[largest])
			largest=r;
		
		if(i!=largest)
		{
			//swap(a[i],a[largest]);
			int temp = a[i];
			a[i] = a[largest];
			a[largest]=temp;
//			int temp = a[i]
			//heapsize--;
			MaxHeapify(largest);
		}
		
	}
	int extractMax()
	{
		if(heapsize<0)
			System.out.println("Underflow");
		int max=a[0];
		a[0]=a[heapsize-1];
		heapsize--;
		MaxHeapify(0);
		return max;
	}
	void increase_key(int i,int new_key)
	{
		if(a[i]>new_key)
			System.out.println("New key is smaller is than present key");
		a[i]=new_key;
		while(i>0 && a[parent(i)]<a[i])
		{
			//swap(a[i],a[parent(i)]);
			int temp = a[i];
			a[i] = a[parent(i)];
			a[parent(i)]=temp;
			i=parent(i);
		}
	}
	int getMax()
	{
		return a[0];
	}
	void deleteKey(int i)
	{
		increase_key(i, Integer.MAX_VALUE);
		extractMax();
	}
	
	void print()
	{
		for(int i=0;i<heapsize;i++)
		{
			System.out.println(a[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxHeap m=new MaxHeap(10);
		m.insertKey(2);
		m.insertKey(9);
		m.insertKey(0);
		m.insertKey(3);
		m.insertKey(10);
		m.insertKey(7);
		m.insertKey(11);
		m.insertKey(4);
		//m.print();
		System.out.println(m.extractMax());
		//m.print();
	   // m.deleteKey(1); 
	    
	    
	   
	    //int e=m.getMax();
	   //System.out.println(e);
	  m.increase_key(1, 49);
	   System.out.println(m.getMax());
	    
	}

}
