package DataStructures;


class QNode
{
	int key;
    QNode next;
     
    // constructor to create a new linked list node
    public QNode(int key) {
        this.key = key;
        next = null;
    }
}
class QueueDS
{
    QNode front, rear;
      
    public QueueDS() {
        this.front = this.rear = null;
    }
      
    // Method to add an key to the queue.  
    void enqueue(int key)
    {
         
        // Create a new LL node
        QNode temp = new QNode(key);
      
        // If queue is empty, then new node is front and rear both
        if (this.rear == null)
        {
           this.front = this.rear = temp;
           return;
        }
      
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }
      
    // Method to remove an key from queue.  
    QNode dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
           return null;
      
        // Store previous front and move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;
      
        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
           this.rear = null;
        return temp;
    }
    void display(){
    	QNode p=this.front;
    	while(p!=null)
    	{
    		System.out.println(p.key);
    		p=p.next;
    	}
    }
}
public class LinkedQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDS q=new QueueDS();
		q.enqueue(20);
		q.enqueue(90);
		q.enqueue(23);
		q.display();

	}

}
