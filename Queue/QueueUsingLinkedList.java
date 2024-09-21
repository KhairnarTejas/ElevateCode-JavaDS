public class QueueUsingLinkedList {
    static class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail =  null;

        public static boolean isEmpty()
        {
            return (head == null && tail == null);
        }

        //add
        public static void add(int data)
        {
            Node newNode = new Node(data);
            if(isEmpty())
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = tail.next;
        }

        public static int remove()
        {
            if(isEmpty()) 
            {
                System.out.println("Queue is Empty.");
                return -1;
            }
            int front = head.data;
            if(head == tail)
            {
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[])
    {
        Queue q = new Queue();
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
