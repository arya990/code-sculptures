package week3.mar6;
// Creating our own linked list
public class LinkedListImplementation {
	private static Node head;

	private int size;

	public LinkedListImplementation() {
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

	public void clearList() {
		head.setLink(null);
		size = 0;
	}

	public void add(int data) {
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

	public Node addAtPositiin(Node head, int data, int position) {
		Node node = new Node();
		node.data = data;
		Node link = null;
		node.link = link;
		if (head == null && position != 0) {
			return head;
		} else if (head == null && position == 0) {
			head = node;
			return head;
		} else if (position == 0) {
			node.n = head;
			head = node;
			return head;

		}
		Node current = head;
		Node previous = null;
		for (int i = 0; i < position; i++) {
			previous = current;
			current = current.getLink();
			if (current == null)
				break;
		}
		node.link = current;
		previous.link = node;
		size++;
		return head;
	}

	public void removeAtEnd() {

		if (size == 0) {
			System.out.println("List is empty");
		} else {
			Node current = head;
			Node link = head.getLink();
			while (link != null) {
				current = link;
				link = link.getLink();
				if (link.getLink().getLink() == null) {
					current = link;
					break;
				}
			}
			current.setLink(null);
			size--;
		}
	}

	public void removeAtPosition(int position) {
		if (size == 0) {
			System.out.println("List is empty");

		} else {
			Node current = head;
			Node link = head.getLink();
			for (int i = 0; i < position - 1; i++) {
				current = link;
				link = link.getLink();
				if (current == null)
					break;
			}

			current.setLink(link.getLink());
			size--;
		}
	}

	public void search(int x) {
		Node current = head;
		while (current != null) {
			if (current.getData() == x) {
				System.out.println("number found");
			}
			current = current.getLink();
		}
	}

	public void printList() {
		if (size == 0)
			System.out.println("List is Empty");
		else {
			Node temp = head.getLink();
			System.out.println("Size of List is:\t" + size);
			while (temp != null) {
				System.out.println(temp.getData() + "->");
				temp = temp.getLink();
			}
		}
	}

	public static void main(String[] args) {
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		LinkedListImplementation list = new LinkedListImplementation();
		list.printList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.printList();
		list.removeAtPosition(2);
		list.printList();
		list.search(3);
		list.removeAtEnd();
		list.printList();
		list.addAtPositiin(head, 9, 3);
		list.printList();

	}

}
