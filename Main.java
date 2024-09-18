package StackWithLinkedList;

public class Main {
    public static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the stack
        stack.printStack();  // Output: Stack: 30 20 10

        // Peek the top element
        stack.peek();  // Output: Peeked: 30
        stack.printStack();
        // Pop elements from the stack
        stack.pop();   // Output: Popped: 30
        stack.printStack();  // Output: Stack: 20 10

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: Is stack empty? false
        System.out.println("Size of the stack is: "+stack.Size());
    }
}
