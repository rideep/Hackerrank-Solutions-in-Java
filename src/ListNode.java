
public class ListNode {
	static ListNode head;
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

	public void push(int new_data) {
		// TODO Auto-generated method stub
		 ListNode new_node=new ListNode(new_data);
		 
			new_node.next=head;
			 head=new_node;
	}
}
