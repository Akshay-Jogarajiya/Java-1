import java.util.*;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println(queue);        // [Task1, Task2, Task3]
        System.out.println(queue.poll()); // Task1 (removed)
        System.out.println(queue.peek()); // Task2 (next in line)

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);          // Internal heap structure (order may look random)
        System.out.println(pq.poll());   // 10 → lowest value first
        System.out.println(pq.poll());   // 20)

        Deque<String> deque = new ArrayDeque<>();

        deque.addLast("Back");
        deque.addFirst("Front");
        deque.add("Middle");

        System.out.println(deque);      // [Front, Back, Middle]
        System.out.println(deque.pollLast()); // Middle
        System.out.println(deque.pollFirst()); // Front
    }
}
