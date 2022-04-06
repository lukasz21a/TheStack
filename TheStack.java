
public class TheStack<T> {
	private Node top;
	private int size = 0;

	private class Node {
		T data;
		Node next;
		
		public Node(T val) {
			this.data = val;
			this.next = null;
		}
	}

	public void push(T val) {
		Node temp = new Node(val);
		temp.next = top;
		top = temp;
		this.size ++;
	}
	
	public T pop() throws StackEmptyException {
		if(isEmpty()) {
			String msg = "The stack is empty, there is nothing to pop.";
			throw new StackEmptyException(msg);
		}
		T data = top.data;
		top = top.next;
		this.size --;
		return data;
	}

	public T peek() throws StackEmptyException {
		if (!isEmpty()) {
			return top.data;
		}
		else {
			String msg = "The stack is empty, there is nothing to peek at.";
			throw new StackEmptyException(msg);
		}
	}

	public void display() throws StackEmptyException{
		if (isEmpty()) {
			String msg = "The stack is empty, there is nothing to display.";
			throw new StackEmptyException(msg);
		}
		else {
			Node temp = top;
			System.out.print("(top) ");
			while (temp != null) {
				System.out.print(temp.data);
				temp = temp.next;
				if(temp != null)
					System.out.print("->");
			}
			System.out.println(" (bottom)");
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}

	public int getSize() {
		return size;
	}
	
}