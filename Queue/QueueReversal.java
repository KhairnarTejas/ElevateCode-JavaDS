import java.util.*;
public class QueueReversal {
    public static void queueReverse(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty())
        {
            s.push(q.remove());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
    }
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<10;i++)
        {
            q.add(i+1);
        }
        queueReverse(q);
        for(int i=0;i<10;i++)
        {
            System.out.print(q.remove() + " ");
        }

    }
}
