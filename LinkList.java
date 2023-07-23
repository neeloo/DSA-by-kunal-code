import org.w3c.dom.Node;

public class LinkList {

	public static void main(String[] args) {
		LL  list=new LL();
		
		// insert at first
		list.insertfirst(1);
		list.insertfirst(4);
		list.insertfirst(1); 
		list.insertfirst(9);
		list.display();
		
		//insert recursive
//		list.insertRec(90,1);
//		list.display();
		
		//insert particular index;
		 
		list.insert(99,2);
		
		// insert at last index
		list.insertlast(22);
		
		list.display();
		
		//delete at first index
		System.out.println(list.deletefirst());
		list.display();
        //delete at last
		System.out.println(list.deletelast());
		list.display();
		//delete particular index
		System.out.println(list.delete(2));
		
		list.display();   
		
	// 	ListNode head = null;
	// 	insert(30,head,3);

	// }
	// static void insert(int data, ListNode head, int pos){
	// 	ListNode add=new  ListNode();
	// 	if(pos==0){
	// 		add.next=head;
	// 		head=add;
	// 		return;
	// 	}
	// 	ListNode pre=head;
	// 	for(int i=0;i<pre;i++){
	// 		pre=pre.next;
	// 	}
	// 	add.next=pre.next;
	// 	pre.next;
	}


   
}
