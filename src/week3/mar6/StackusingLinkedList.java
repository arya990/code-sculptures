package week3.mar6;

public class StackusingLinkedList {
	private static Node head;
	private int size;

	public StackusingLinkedList() {
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

	public void push(int data) {
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

	private void pop() {
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

	public void displayStack() {
		System.out.println("  ");
		if (size == 0)
			System.out.println("Stack is Empty");
		else {
			Node temp = head.getLink();
			System.out.println("Size of Stack is:\t" + size);
			while (temp != null) {
				System.out.println(temp.getData() + "->");
				temp = temp.getLink();
			}
		}
		
	}

	public static void main(String[] args) {
		StackusingLinkedList linkedList = new StackusingLinkedList();
		linkedList.displayStack();
		linkedList.push(1);
		linkedList.push(2);
		linkedList.push(3);
		linkedList.push(4);
		linkedList.displayStack();
		linkedList.pop();
		linkedList.pop();
		linkedList.push(5);
		linkedList.push(6);
		linkedList.pop();
		linkedList.displayStack();
	}

}
