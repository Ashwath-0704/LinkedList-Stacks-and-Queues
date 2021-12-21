package DataStructur;

public class LinkedNewList<T> {
	public node<T> head;
	public node<T> tail;
	
	public LinkedNewList() {
		this.head=null;
		this.tail=null;
	}
	
	public void add(node<T> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
			System.out.println("Added "+this.head);
		} 
		else {
			node<T> tempNode = this.head;
			this.head = newNode;
			System.out.println("Added "+this.head);
			this.head.setNext(tempNode);
		}
	}

	public node<T> pop() {
		node<T> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
		
	}

	public void printMyNode() {
		System.out.println("*****************\nAfter deleting node : " + head);
	}
}
