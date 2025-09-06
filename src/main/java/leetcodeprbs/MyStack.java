package leetcodeprbs;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

   // Problem: Implement a stack using queues. Support push, pop, top, and empty operations.

    Queue<Integer> q1 = new LinkedList<>(); // Main queue
    Queue<Integer> q2 = new LinkedList<>(); // Temp queue for reordering

    public void push(int x) {
        q2.add(x); // Add new element to temp
        while (!q1.isEmpty()) {
            q2.add(q1.remove()); // Move all from main to temp
        }
        // Swap queues so top is at front of q1
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove(); // Remove from front (top of stack)
    }

    public int top() {
        return q1.peek(); // Peek front
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Test case 1: Basic operations
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top()); // Expected: 2
        System.out.println(stack.pop()); // Expected: 2
        System.out.println(stack.empty()); // Expected: false

        // Test case 2: Pop from single element
        System.out.println(stack.pop()); // Expected: 1
        System.out.println(stack.empty()); // Expected: true

        // Test case 3: Push after empty
        stack.push(3);
        System.out.println(stack.top()); // Expected: 3

        // Test case 4: Multiple pushes
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop()); // Expected: 5

        // Test case 5: Empty check on new stack
        MyStack emptyStack = new MyStack();
        System.out.println(emptyStack.empty()); // Expected: true
    }

        /*Explanation: We use two queues. On push, we add to the temp queue, move all from main to temp (reversing order), then swap.
        This keeps the newest element at the front of the main queue for pop/top.

        Complexity: Push: O(n) time (moving elements). Pop/Top/Empty: O(1) time. Space: O(n).*/
}