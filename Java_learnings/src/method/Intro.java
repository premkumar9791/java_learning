package method;

class node{

	int val;
	node next;
	
	public node(int val){
	this.val=val;
    this.next = null;
	}
	
}

class LinkedList{
	node head;
    void printLinklist() {
		node curr =this.head;
		
		while(curr != null) {
		 System.out.println(curr.val);
		 curr=curr.next;
		}
		
	}	
}

public class Intro {
	
	public static void main(String []args) {
		LinkedList LL=new LinkedList();
		node p1=new node(10);
		node p2=new node(20);
		node p3=new node(30);
		node p4=new node(40);
		
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		LL.head=p1;
		
		LL.printLinklist();
		
	}
}

	
