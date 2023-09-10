import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;

    /** Initialize your data structure here. */
    public MyStack() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        // Move all elements from the mainQueue to tempQueue
        while (!mainQueue.isEmpty()) {
            tempQueue.offer(mainQueue.poll());
        }

        // Add the new element to the mainQueue
        mainQueue.offer(x);

        // Move elements back from tempQueue to mainQueue
        while (!tempQueue.isEmpty()) {
            mainQueue.offer(tempQueue.poll());
        }
    }

    /** Removes the element on the top of the stack and returns it. */
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return mainQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mainQueue.isEmpty();
    }
}
