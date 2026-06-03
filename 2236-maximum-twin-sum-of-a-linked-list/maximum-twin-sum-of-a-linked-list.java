

class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode first = head;
        ListNode second = prev;

        int maxSum = 0;
        while (second != null) {
            int sum = first.val + second.val;
            if (sum > maxSum) {
                maxSum = sum;
            }
            first = first.next;
            second = second.next;
        }

        return maxSum;
    }
}