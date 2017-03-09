package week3.mar6;

public class LinkedListImplementation {
	private Node head;

	private int size;

	// private int index;

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

	public void addAtPositiin(int data, int position) {
		Node node = new Node(data);
		if (size == 0) {
			head.setLink(node);
			node.setLink(null);
			size++;
		} else {
			Node current = head;
			Node previous = null;
			for (int i = 0; i < size; i++) {
				previous=current;
				current=current.getLink();
				if(current==null)
					break;
			}
			current.setLink(node);;
			previous.setLink(node);
			size++;
		}
	}

	public void removeAtEnd() {

		if (size == 0) {
			System.out.println("List is empty");
		} else {
			Node current = head;
			Node link = head.getLink();
			while (link != null) {
				current = link;
				link = link.getLink().getLink();
			}
			current.setLink(null);
			size--;
		}
	}

	public void removeAtPosition(int index) {
		if (size == 0) {
			System.out.println("List is empty");

		} else {
			Node current = head;
			Node link = head.getLink();
			Node previous = head;
			Node temp = null;
			for (int i = 0; i < size; i++) {
				previous = current.getLink();
				current = link;
				link = link.getLink();
				if (i == index) {
					temp = current.getLink();
					// previous=temp;
					// previous.setLink(temp);
					break;
				}
			}
			// current=current.getLink();
			previous.setLink(temp);
			size--;
		}
	}

	public boolean search(int x) {
		Node current = head;
		while (current != null) {
			if (current.getData() == x) {
				return true;
			}
			current = current.getLink();
		}
		return false;
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
		// list.add(5);
		list.printList();
//		list.removeAtPosition(2);
//		list.printList();
		list.search(3);
		list.removeAtEnd();
		list.printList();
		list.addAtPositiin(9,1 );
		list.printList();

	}

}
