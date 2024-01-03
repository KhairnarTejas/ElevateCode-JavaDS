import java.util.*;

public class QueueUsingjavacollectionFramework {
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();

        //We can also udse ArrayDequeue
        //Queue<Integer> q = new ArrayDequeue<>();

        for(int i= 0; i<5; i++)
        {
            q.add(i+1);
        }
        for(int i= 0; i<5; i++)
        {
            System.out.print(q.remove() + " ");
        }

    }
}
