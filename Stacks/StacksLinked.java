package DataStructur;

public class StacksLinked<T> {

	private final LinkedNewList<T> LinkedNewList;

	public StacksLinked() {
		LinkedNewList = new LinkedNewList<T>();
	}

	/*
	 * UC:1 70 will be added first then 30 and then 56 to make 56 on top of the
	 * Stack
	 */
	public void push(node<T> i) {
		LinkedNewList.add(i);
	}

	/*
	 * UC:1 70 will be added first then 30 and then 56 to make 56 on top of the
	 * Stack
	 */
	public node<T> peak() {
		return LinkedNewList.head;
		
	}

	public node<T> pop() {

		return LinkedNewList.pop();
	}
	/* 
	 * Displaying
	 */
	public void printStack() {
		LinkedNewList.printMyNode();
	}

	public static void main(String[] args) {
		StacksLinked<Integer> head = new StacksLinked<Integer>();
		Mynode1<Integer> list = new Mynode1<Integer>(70);
		Mynode1<Integer> list1 = new Mynode1<Integer>(30);
		Mynode1<Integer> list2 = new Mynode1<Integer>(56);
		// push
		head.push(list);
		head.push(list1);
		head.push(list2);
		// peek
		System.out.println("\nNodes linked are : " + head.peak()+ "\n");
		// pop
		head.pop();
		head.pop();
		head.pop();
		
		head.printStack();

	}

}
