package week3.mar6;
import javax.swing.plaf.SliderUI;


		public class LinkedListImplementation {
			private Node head;

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
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				LinkedListImplementation list = new LinkedListImplementation();
				list.printList();
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				list.printList();
				list.removeAtEnd();
				list.printList();
				
			}

		}
