/**
 * https://simplesolution.dev/
 */
package simplesolution.dev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeExamples {

    public static void main(String... args) {
        usingArrayDequeAsAStack();
        usingArrayDequeAsAQueue();
        usingIterator();
        usingOtherMethods();
    }

    private static void usingArrayDequeAsAStack() {
        System.out.println("Using ArrayDeque As a Stack");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        Integer element = stack.pop();
        System.out.println(element);
        System.out.println(stack);
    }

    private static void usingArrayDequeAsAQueue() {
        System.out.println("Using ArrayDeque As a Queue");
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);

        Integer element = queue.poll();
        System.out.println(element);
        System.out.println(queue);
    }

    private static void usingIterator() {
        System.out.println("Using ArrayDeque iterator");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("descendingIterator");
        Iterator descendingIterator = stack.descendingIterator();
        while(descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        System.out.println("iterator");
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void usingOtherMethods() {
        System.out.println("Using ArrayDeque methods");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.size());
        Object[] objectArray = stack.toArray();
        System.out.println(objectArray);

        Integer[] integerArray = stack.toArray(new Integer[0]);
        System.out.println(integerArray);

        System.out.println(stack.isEmpty());

        System.out.println(stack.contains(2));
        System.out.println(stack.contains(5));
    }

}
