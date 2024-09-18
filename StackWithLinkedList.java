package StackWithLinkedList;



public class StackWithLinkedList {
    private Node top; // the top of the stack (head of the linked list)

    public boolean isEmpty(){
        return top == null; // if top is null, the stack is empty
    }

//    constructor to initialize the stack
    public StackWithLinkedList() {
        this.top = null;
    }

    //push method
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // link the new node to the current top
        top = newNode; // update the top to point to the new node
        System.out.println("Pushed: "+data);
    }


//    pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        int poppedValue = top.data; // get the value of the top element
        top = top.next; // remove the top element by updating the top reference
        System.out.println("Popped: "+poppedValue);
        return poppedValue;
    }
//    peek method
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Peeked: "+top.data);
        return top.data;
    }
//    size
    public int Size(){
        int count = 0;
        Node current = top; // start from the top of the stack

        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }

//    print the Stack with LinkedList
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;
        System.out.print("Stack: ");
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
