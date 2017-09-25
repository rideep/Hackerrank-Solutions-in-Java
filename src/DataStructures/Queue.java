package DataStructures;

public class Queue {

	int rear,front,capacity;
	int size;
	int a[];
	public Queue(int capacity)
	{
		this.capacity = capacity;
		front=this.size=0;
		rear=capacity-1;
		a=new int[this.capacity];
	}
	boolean isFull(Queue queue)
	{
		if(queue.size==queue.capacity)
			return true;
		return false;
	}
	boolean isEmpty(Queue queue)
	{
		if(queue.size==0)
			return true;
		return false;
	}
	public void enQueue(int item)
	{
		if(isFull(this))
			return;
		this.rear=(this.rear+1)%this.capacity;
		this.a[this.rear]= item;
		this.size=this.size+1;
	}
	public int deQueue() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item=this.a[this.front];
		this.front=(this.front+1)%capacity;
		this.size=this.size-1;
		return item;
	}
	int front()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.a[this.front];
	}
	int rear()
	{
		if(isEmpty(this))
			return Integer.MAX_VALUE;
		return this.a[this.rear];
	}
	public void display(Queue queue) {
		for(int i=this.front;i<=this.rear;i++)
		{
			System.out.println(this.a[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue(50);
		queue.enQueue(67);
        queue.enQueue(20);
        queue.enQueue(40);
        queue.display(queue);
        
        int rear=queue.rear();
        System.out.println(rear);
		
		

	}

}
