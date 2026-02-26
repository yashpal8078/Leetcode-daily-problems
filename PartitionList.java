class Node {
    int val;
    Node next;
    Node(int x) { val = x; }
}

public class PartitionList {
 
    
    public Node partition(Node head, int x) {
        Node beforeHead = new Node(0);
        Node before = beforeHead;
        Node afterHead = new Node(0);
        Node after = afterHead;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        after.next = null; 
        before.next = afterHead.next;

        return beforeHead.next;
    }

    public static void main(String[] args) {
        PartitionList solution = new PartitionList();
        
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        int x = 3;
        Node result = solution.partition(head, x);

        System.out.print("Partitioned list: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
