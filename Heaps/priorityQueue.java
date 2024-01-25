
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {

    static class student implements Comparable<student> {
        String name;
        int rank;

        student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        PriorityQueue<Integer> reversepq = new PriorityQueue<>(Comparator.reverseOrder());

        reversepq.add(3);
        reversepq.add(4);
        reversepq.add(1);
        reversepq.add(7);

        while (!reversepq.isEmpty()) {
            System.out.println(reversepq.peek());
            reversepq.remove();
        }

        PriorityQueue<student> objpq = new PriorityQueue<>();

        objpq.add(new student("A", 4));
        objpq.add(new student("B", 5));
        objpq.add(new student("C", 2));
        objpq.add(new student("D", 12));

        while (!objpq.isEmpty()) {
            System.out.println(objpq.peek().name + "->" + objpq.peek().rank);
            objpq.remove();
        }
    }
}
