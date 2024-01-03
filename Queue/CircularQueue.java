public class CircularQueue {
    static class CQueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        CQueue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty()
        {
            return (rear == -1 && front == -1);
        }

        public static boolean isFull()
        {
            return (front == (rear+1)%size);
        }

        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is Full.");
                return;
            }
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty.");
                return -1;
            }
            int result = arr[front];
            if(front == rear)
            {
                front = rear = -1;
            }else{
                front = (front +1)%size;
            }
        
            return result;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[])
    {
        CQueue q = new CQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }
    }
}
