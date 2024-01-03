public class DoublyLinkedList {

    public class Node 
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data = data;
            next =null;
            prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    //addFirst
    public void addFirst(int data)
    {
        if(head == null)
        {
            head = tail = new Node(data);
            return;
        }
        Node temp =  new Node (data);
        head.prev = temp;
        temp.next = head;
        head = temp;
        head.prev = null;
    }
    //addLast
    public void addLast(int data)
    {
        if(head == null)
        {
            head = tail = new Node(data);
            return;
        }
        Node temp =  new Node (data);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        tail.next =null;
    }

    //removeLast
    public int removeLast()
    {
        if(head == null )
        {
            System.out.println("LinkedList is Empty.");
            return -1;
        }
        int val =tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }
    //removeFirst
    public int removeFirst()
    {
        if(head == null )
        {
            System.out.println("LinkedList is Empty.");
            return -1;
        }
        int val =head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public void print()
    {
        if(head == null)
        {
            System.out.println("Linked List is Empty.");
            return;
        }
        
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp= temp.next;
        }
        System.out.println("null");
    }


    public void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;          
        }
        head = prev;
    }
    public static void main(String args[])
    {
        DoublyLinkedList dll =new DoublyLinkedList();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.print();
        System.out.println("Deleted : " + dll.removeLast() );
        dll.print();
        System.out.println("Deleted : " + dll.removeFirst() );
        dll.print();

        dll.addFirst(1);
        dll.addLast(4);
        dll.reverse();
        dll.print();
        
    }
}
