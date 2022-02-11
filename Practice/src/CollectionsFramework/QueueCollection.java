package CollectionsFramework;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("Aniket");
        q.add("Radhika");
        q.add("Emily");
        q.add("Amit");
        System.out.println("All candidates");
        System.out.println(q);
        Queue<String> promoted = new ArrayDeque<>();
        promoted.add("Radhika");
        promoted.add("Amit");
        System.out.println("Promoted candidates");
        System.out.println(promoted);
        q.retainAll(promoted);
        System.out.println("Selected candidates");
        System.out.println(q);
    }
}
