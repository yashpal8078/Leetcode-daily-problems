/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {

        // ArrayList<Integer> arr = new ArrayList<>();

        // while (head != null) {
        //     arr.add(head.val);
        //     head = head.next;
        // }

        int max = Integer.MIN_VALUE;

        // int n = arr.size();
        // for (int i = 0; i <= n / 2; i++) {
        //     int sum = arr.get(i) + arr.get(n - i - 1);
        //     max = Math.max(sum, max);
        // }

        // return max;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow  = slow.next;
            fast = fast.next.next;
        }

        ListNode reverse = reverse(slow);
        slow.next = null;

        slow = head;


        while(slow != null && reverse != null){
            int sum = slow.val + reverse.val;
            max = Math.max(sum , max);
            slow = slow.next;
            reverse = reverse.next;
        }

        return max;

    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }
}