import java.util.*;
public class BasicPQ {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq  = new PriorityQueue<>();
        PriorityQueue<Integer> pq  = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(11);  // O(logn)
        pq.add(0);
        pq.add(22);
        pq.add(33);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); //O(logn)
        }
    }
}
