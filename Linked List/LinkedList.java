

public class LinkedList {

    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        //step1 = create new Node 
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head= tail= newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next=head; //link

        //step 3 - head = newNode
        head= newNode;
    }
    public void addLast(int data)
    {
        //step1 = create new Node 
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head= tail= newNode;
            return;
        }

        //step2 - tail next = newNode
        tail.next=newNode; //link

        //step 3 - tail = newNode
        tail= newNode;
    }

    public void add(int idx, int data)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while( i < idx-1)
        {
            temp=temp.next;
            i++;
        }

        //i = idx-1; temp-> prev

        newNode.next = temp.next;
        temp.next = newNode;
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
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(size==0)
        {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head=head.next;
        return val;
    }
    public int removeLast(){
        if(size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
    
        // //prev: i = size - 2
        // Node prev = head;
        // for(int i = 0; i < size - 2; i++) {
        //     prev = prev.next;
        // }
    
        // int val = tail.data; //tail.data
        // prev.next = null;
        // tail = prev;
        // size--;
    
        // return val;

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.data;
        temp.next=null;
        return val;
    }
    
    public int itrSearch(int key)
    {
        Node temp = head;
        int i=0;

        while(temp != null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }
        int idx=helper(head,key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;

    }

    public int recSearch(int key)
    {
        return helper(head, key);
    }

    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head ;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        head=prev;
    }

    public void deleteNthfromEnd(int n)
    {
        //Calculate Size
        int sz = 0;
        Node temp = head;
        while(temp != null)
        {
            temp= temp.next;
            sz++;
        }

        if( n == sz)
        {
            head=head.next; //removeFirst
            return;
        }

        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i< iToFind){
            prev=prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Slow-Fast Approach
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null)
        {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome()
    {
        if(head==null || head.next== null)
        {
            return true;
        }
        //step1 -  find mid
        Node midNode = findMid(head);
        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right= prev; //right half head
        Node left =head;

        //step3 - check left half & right half
        while(right != null)
        {
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }

    public static boolean isCycle()
    {
        Node slow =head;
        Node fast = head;

        while(fast != null && fast.next!=null)
        {
            slow = slow.next;     //+1
            fast=fast.next.next;  //+2
            if(slow==fast)
            {
                return true;  //Cycle Exists
            }
        }
        return false;  //Cycle doesn't Exists
    }

    public static void removeCycle()
    {
        //detect  Cycle
        Node slow= head;
        Node fast= head;
        boolean cycle =false;
        while(head!= null && head.next!= null)
        {
            slow =slow.next;
            fast=fast.next.next;
            if(fast ==slow)
            {
                cycle = true;
                break;
            }
            if(cycle==false)
            {
                return;
            }
        }

        //find meeting point 
        slow=head;
        Node prev=null;
        while(slow != fast)
        {
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        
        //remove cycle ->last.next = null
        prev.next=null;

    }
    public static void main(String args[])
    {
        /* 
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 5);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.itrSearch(4));
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(15));

        ll.reverse();
        ll.print();

        ll.deleteNthfromEnd(2);
        ll.print();
*/
       /* LinkedList ll1= new LinkedList();
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(2);
        ll1.addLast(1);

        ll1.print();
        System.out.println(ll1.checkPalindrome());

        // ll1.removeFirst();
        // ll1.removeFirst();
        // ll1.removeFirst();

        ll1.print();
        System.out.println(ll1.checkPalindrome());

*/
        
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

        
    }
}
