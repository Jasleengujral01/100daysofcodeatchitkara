import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1; // Stack for push and pop operations
    private Stack<Integer> stack2; // Stack for peek operation

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            moveElements();
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            moveElements();
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void moveElements() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
