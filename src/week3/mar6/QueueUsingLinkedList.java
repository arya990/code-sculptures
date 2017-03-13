package week3.mar6;

// Queue using stack
public class QueueUsingLinkedList {

	private static Node head;
	private int size;

	public QueueUsingLinkedList() {
		head = new Node();
		head.setLink(null);
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public int getSize() {
		return this.size;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head.setLink(newNode);
			newNode.setLink(null);
			size++;
		} else {
			Node temp = head.getLink();
			Node currentNode = temp;
			while (temp != null) {
				currentNode = temp;
				temp = temp.getLink();
			}
			currentNode.setLink(newNode);
			newNode.setLink(null);
			size++;
		}
	}

	@SuppressWarnings("null")
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
		}
		Node link = head;
		head = link.getLink();
		if (head == null)
			return (Integer) null;
		size--;
		return link.getData();
	}

	public void displayQueue() {
		if (size == 0)
			System.out.println("queue is Empty");
		else {
			Node temp = head.getLink();
			System.out.println("Size of queue is:\t" + size);
			while (temp != null) {
				System.out.println(temp.getData() + "->");
				temp = temp.getLink();
			}
		}
	}

	public static void main(String[] args) {

		QueueUsingLinkedList list = new QueueUsingLinkedList();
		list.displayQueue();
		list.enqueue(1);
		list.enqueue(2);
		list.enqueue(3);
		list.dequeue();
		list.enqueue(4);
		list.enqueue(5);
		list.dequeue();
		list.dequeue();
		list.dequeue();
		list.dequeue();
		list.dequeue();
		list.dequeue();
		list.displayQueue();

	}

}
