class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    
    // Function to reverse the linked list
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next; 
            curr.next = prev;             
            prev = curr;                  
            curr = nextNode;               
        }
        
        return prev; 
    }

    // Utility function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

   
    public static void main(String[] args) {
        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        head = reverse(head);

        System.out.println("Reversed List:");
        printList(head);
    }
}
