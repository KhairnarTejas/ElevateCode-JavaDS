public class LinkedListMergeSort {

    
        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data) {
            // step1 = create new Node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // step2 - newNode next = head
            newNode.next = head; // link

            // step 3 - head = newNode
            head = newNode;
        }

        public void addLast(int data) {
            // step1 = create new Node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // step2 - tail next = newNode
            tail.next = newNode; // link

            // step 3 - tail = newNode
            tail = newNode;
        }

        public void add(int idx, int data) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;

            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }

            // i = idx-1; temp-> prev

            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void print() {
            if (head == null) {
                System.out.println("Linked List is Empty.");
                return;
            }
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int removeFirst() {
            if (size == 0) {
                System.out.println("Linked List is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public int removeLast() {
            if (size == 0) {
                System.out.println("Linked List is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            // prev: i = size - 2
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }

            int val = tail.data; // tail.data
            prev.next = null;
            tail = prev;
            size--;

            return val;
        }

        private  Node getMid(Node head)
        {
            Node slow = head;
            Node fast = head.next;

            while( fast != null && fast.next != null)
            {
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }
            return slow; //slow is my midNode 
        }

        
            private Node merge(Node head1, Node head2) {
                Node mergedLL = new Node(-1);
                Node temp = mergedLL;
            
                while (head1 != null && head2 != null) { // Change the condition here
                    if (head1.data <= head2.data) {
                        temp.next = head1;
                        head1 = head1.next;
                    } else {
                        temp.next = head2;
                        head2 = head2.next;
                    }
                    temp = temp.next; // Move temp pointer
                }
            
                // Add any remaining nodes from both lists (if any)
                while (head1 != null) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }
            
                while (head2 != null) {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            
                return mergedLL.next;
            }
            
        

        public Node mergeSort(Node head) {

            if (head == null || head.next == null) {
                return head;
            }
            // find mid
            Node mid = getMid(head);
            // left & right MS
            Node rightHead = mid.next;
            mid.next = null;
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            // merge
            return merge(newLeft, newRight);
        
        }

   

    public static void main(String args[]) {
            LinkedListMergeSort ll = new LinkedListMergeSort();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);

            ll.print();

            ll.head=ll.mergeSort(ll.head);
            ll.print();
        }
    }
