package DataStructur;

//A Linked List Node
class Nodenew {
	int data;
	Nodenew next;

	public Nodenew(int data) {
		// set data in the allocated node and return it
		this.data = data;
		this.next = null;
	}
}

class QueueNew {
	private static Nodenew rear = null, front = null;
	private static int count = 0;

	/* UC-4
	 * Ability to dequeue from the beginning
	 */

	public static int dequeue() {
		if (front == null) {
			return -1;
		}
		Nodenew temp = front;
		System.out.printf("Removing %d\n", temp.data);
		front = front.next;

		// if the list becomes empty
		if (front == null) {
			rear = null;
		}
		count -= 1;
		return temp.data;
	}
	
	/*UC-3
	 * Ability to create a Queue of 56->30->70
	 * Use LinkedList to do the Queue Operations
	 */
	public static void enqueue(int item) {

		Nodenew node = new Nodenew(item);
		System.out.printf("Inserting %d\n", item);

		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		count += 1;
	}

// show the top element in a queue
	public static int peek() {
		if (front == null) {
			return -1;
		}
		return front.data;
	}

// checking the queue is empty or not
	public static boolean isEmpty() {
		return rear == null && front == null;
	}

// Function to return the size of the queue
	private static int size() {
		return count;
	}
}

public class QueueLinked {
	public static void main(String[] args) {
		
		QueueNew q = new QueueNew();
		q.enqueue(56);
		q.enqueue(30);
		q.enqueue(70);
		System.out.printf("________________________\nThe front element is %d", q.peek());
		System.out.println("\n");
		q.dequeue();
		q.dequeue();
		q.dequeue();
		if (q.isEmpty()) {
			System.out.println("____________________\nThe queue is empty");
		} else {
			System.out.println("___________________\nThe queue is not empty");
		}
	}
}
