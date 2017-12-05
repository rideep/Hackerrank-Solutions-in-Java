
public class InsertionSort {
		public static void InsertionSort(int a[])
		{	
			
			
			for(int j=1;j<a.length;j++)
			{
				int key=a[j];
				int i=j-1;
				while(i>=0 && a[i]>key)
				{
					a[i+1]=a[i];
					i--;
				}
				a[i+1]=key;
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
		}
	
	public static void main(String[] args) {
		int a[]={5,2,3,7,1,6,0,89,23,12,14,10};
		InsertionSort(a);
		
	}

}
