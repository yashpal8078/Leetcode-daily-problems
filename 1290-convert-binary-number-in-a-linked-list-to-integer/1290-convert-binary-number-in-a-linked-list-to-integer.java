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
    public int getDecimalValue(ListNode head) {
        StringBuilder st = new StringBuilder();
        while(head!=null){
            st.append(head.val);
            head = head.next;
        }

        String s = st.toString();
        int result = 0;
        for(char c : s.toCharArray()){
            result = result*2 + (c - '0');
        }

        return result;
    }
}