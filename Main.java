
public class Main {
	public static void main(String[] args) {

		TheStack<Integer> stack = new TheStack<Integer>();

		stack.push(Integer.valueOf(1));
		stack.push(Integer.valueOf(5));
		stack.push(Integer.valueOf(34));
		stack.push(Integer.valueOf(16));

		stack.display();

		System.out.println("Top element is " + stack.peek());
		
		try {
			System.out.println("The deleted element is " + stack.pop());
			System.out.println("The deleted element is " + stack.pop());
			System.out.println("The deleted element is " + stack.pop());
			System.out.println("The deleted element is " + stack.pop());
			System.out.println("The deleted element is " + stack.pop());
		} catch (Exception StackEmptyException) {
			System.out.println(StackEmptyException.toString());
		}
		
		try {
			stack.display();
		} catch (Exception StackEmptyException) {
			System.out.println(StackEmptyException.toString());
		}
		
		System.out.println("The size of the stack is: " + stack.getSize());
		
		try {
			System.out.println("Top element is " + stack.peek());
		} catch (Exception StackEmptyException) {
			System.out.println(StackEmptyException.toString());
		}
	}
}