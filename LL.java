public class LL {
	private Node head;
	private Node tail;
	private int size;
	
public LL(){
	this.size=0;
}
     // Insert element at first index**************
	public void insertfirst(int val) {
		Node node=new Node(val);
		node. next =head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size+=1;
		
	}
	
	
	//Insert element at index using recursion*************
//	private Node insertRec(int val,int index,Node node) {
//		if(index==0) {
//			Node temp=new Node(val,node);
//			size++;
//			return temp;
//		}
//		node.next=insertRec(val,index--,node.next);
//		return node;
//		
//	}
//	public void insertRec(int val,int index) {
//		head=insertRec(val,index,head);
//	}
//	
	
	// insert at particular index**********
	public void insert(int val,int index) {
		
		if(index==0) {
			insertfirst(val);
			return;
		}
		if(index==size) {
			insertlast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node=new Node (val,temp.next);
		temp.next=node;
		size++;

		
	}
	
	/// INSERT Element at last index************
	public void insertlast(int val) {
		if(tail==null) {
			insertfirst(val);
			return ;
		}
		Node node=new Node(val);
		tail.next=node;
		tail=node;
		size++;
		
	}
	
	// delete at at last index**************
	public int deletelast() {
		if(size<=1) {
			return deletefirst();
		}
		Node secondlast=get(size-2);
		int val=tail.value;
		tail=secondlast;
		tail.next=null;
		return val;
	}
	
	// delete at particular index value**********
	public int delete(int index) {
		if(index==0) {
			return deletefirst();
		}
		if(index==size) {
			return deletelast();
		}
		Node prev=get(index-1);
		int val=prev.next.value;
		prev.next=prev.next.next;
		return val;
	}
	/// get node value******
	public Node find(int value) {
		Node node=head;
		while(node!=null) {
			if(node.value==value) {
				return node;
			}
			node=node.next;
		}
		return null;
		
	}
	
	
	// get node of index**********
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
		
	}
	
	// Delete element at firstindex*************
	public int deletefirst() {
		int val=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}
	
	
	
      // Display element***************
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"<-");
			temp=temp.next;
		}
		System.out.println("END");
		
	}    


	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value ,Node next) {
			this.value=value;
			this.next=next;
		}
		
	}
	
	// Question-remove dublicate*************
	/*
	  public void dublicate() {
		Node node=head;
		while(node.next!=null) {
			if(node.value==node.next.value) {
				node.next=node.next.next;
				size--;
			}else {
				node=node.next;
			}
		}
		tail=node;
		tail.next=null;
	}
	
	
	// merge tow list**********
	public  static LL merge(LL first,LL second) {
		Node f=first.head;
		Node s=second.head;
		LL ans=new LL();
		while(f!=null && s!=null) {
			if(f.value<s.value) {
				ans.insertlast(f.value);
				f=f.next;
			}else {
				ans.insertlast(s.value);
				s=s.next;
			}
		}
		while(f!=null) {
			ans.insertlast(f.value);
			f=f.next;
		}
		while(s!=null) {
			ans.insertlast(s.value);
			s=s.next;
		}
		return ans;
	}  */
	

	/// leedcode -142 solutuon**********
	
	public int lengthcycle(ListNode head) {
	
		ListNode fast=head;
		ListNode slow=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) {
				ListNode temp=slow;
				int length=0;
				do {
					temp=temp.next;
					length++;
				}while(temp!=slow);
				return length;
			}
		}
		return 0;
		
	}
	
	
public ListNode detectCycle(ListNode head) {
      int length=0;   
	ListNode fast=head;
	ListNode slow=head;
	while(fast!=null && fast.next!=null) {
		fast=fast.next.next;
		slow=slow.next;
		if(fast==slow) {
			length=lengthcycle(slow);
			break;
		}
		}
	if(length==0) return null;
	ListNode f=head;
	ListNode s=head;
	while(length>0) {
		s=s.next;
		length--;
	}
	while(f!=s) {
		f=f.next;
		s=s.next;
	}
	return s;
    }
	
	
class ListNode{
	int val;
	ListNode next;
}
	
	
	public static void main(String[] args) {
//		LL list=new LL();
//		list.insertlast(22);
//		list.insertlast(22);
//		list.insertlast(25);
//		list.insertlast(25);
//		list.insertlast(28);
//		list.display();
//		
//		list.dublicate();
//		list.display();
		
//		LL first=new LL();
//		LL second=new LL();
//		
//		 first.insertlast(1);
//		 first.insertlast(3);
//		 first.insertlast(5);
//		 
//		 second.insertlast(1);
//		 second.insertlast(2);
//		 second.insertlast(9);
//		 
//		LL ans=LL.merge(first,second);
//		ans.display();
		
		
		
		
	}
	


}















