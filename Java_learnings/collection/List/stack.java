package List;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {


		 
        // Default initialization of Stack
        Stack stack1 = new Stack();
 
        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();
 
        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push("Geeks");
 
        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");
 
          // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
		
		// Creating an empty Stack
        Stack<String> stack = new Stack<String>();
 
        // Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
 
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);
 
        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                           + " stack is: " + stack.peek());
 
        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);
		
		 
	   
	}

}
