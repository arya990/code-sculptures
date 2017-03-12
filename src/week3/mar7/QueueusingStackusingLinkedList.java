package week3.mar7;

import week3.mar6.Node;

public class QueueusingStackusingLinkedList {

	private static Node head;
	private int size;

	static QueueusingStackusingLinkedList list1 = new QueueusingStackusingLinkedList();
	static QueueusingStackusingLinkedList list2 = new QueueusingStackusingLinkedList();

	public QueueusingStackusingLinkedList() {
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

	public int pop() {
		Node current = head;

		if (size == 0) {
			System.out.println("List is empty");
		} else {
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
		return current.getData();
	}

	public void displayQueue() {
		System.out.println("  ");
		if (size == 0)
			System.out.println("queue is Empty");
		else {
			Node temp = head.getLink();
			System.out.println("Size of Queue is:\t" + size);
			while (temp != null) {
				System.out.println(temp.getData() + "->");
				temp = temp.getLink();
			}
		}

	}

	public void enqueue(int data) {
		if (list1.isEmpty()) {
			list1.push(data);
		} else {
			while (!list1.isEmpty()) {
				list2.push(list1.pop());
			}
			list1.push(data);

			while (!list2.isEmpty()) {
				list1.push(list2.pop());
			}
		}
	}

	public void dequeue() {
		list1.pop();
	}

	public static void main(String[] args) {
		list1.displayQueue();
		list1.enqueue(2);
		list1.enqueue(4);
		list1.enqueue(6);
		list1.enqueue(8);
		list1.displayQueue();
		list1.dequeue();
		list1.displayQueue();
		list1.enqueue(3);
		list1.enqueue(5);
		list1.displayQueue();
	}
}
