package chapter4.Stack;

public class Test {
    public static void main(String[] args) {
        // Array Stack test
        ArrayStack myStack = new ArrayStack();
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack.pop());

        // Dynamic Array Stack test
        DynArrayStack dynArrStack = new DynArrayStack();
        dynArrStack.push(5);
        dynArrStack.push(10);
        dynArrStack.push(11);
        dynArrStack.push(1);
        dynArrStack.push(4);

        // Linked List Stack test
        LLStack llStack = new LLStack();
        llStack.Push(10);

        System.out.println(llStack.isEmpty());

        llStack.deleteStack();

        System.out.println(llStack.isEmpty());
    }
}
