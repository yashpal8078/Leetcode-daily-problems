class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sum = new ListNode(0);
        ListNode sum1 = sum;

        ListNode prev1 = null;
        while(l1 != null){
            ListNode next = l1.next;
            l1.next = prev1;
            prev1 = l1;
            l1 = next;
        }

        ListNode prev2 = null;
        while(l2 != null){
            ListNode next = l2.next;
            l2.next = prev2;
            prev2 = l2;
            l2 = next;
        }

        int carry = 0;
        while(prev1 != null || prev2 != null || carry == 1){
            int add = 0;

            if(prev1 != null){
                add += prev1.val;
                prev1 = prev1.next;
            }

            if(prev2 != null){
                add += prev2.val;
                prev2 = prev2.next;
            }

            add += carry;
            carry = add / 10;

            ListNode node = new ListNode(add % 10);
            sum1.next = node;
            sum1 = sum1.next;
        }

        ListNode prev = null;
        ListNode ans = sum.next;
        while(ans != null){
            ListNode next = ans.next;
            ans.next  = prev;
            prev = ans;
            ans = next;
        }

        return prev; 
    }
}