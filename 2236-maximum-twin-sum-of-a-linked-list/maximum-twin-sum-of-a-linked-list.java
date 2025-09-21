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
    if (head == null || head.next == null) {
        return 0;
    }
    if (head.next.next == null) { 
        return head.val + head.next.val;
    }
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
       
       ListNode curr = slow;
       ListNode prev = null;

       while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       ListNode temp1 = head;
       ListNode temp2 = prev;
       int sum = 0;
       int max_sum = 0;
       while(temp1 != null && temp2 != null){
        sum = temp1.val + temp2.val;
        max_sum = Math.max(max_sum, sum);
        temp1 = temp1.next;
        temp2 = temp2.next;
       }
       return max_sum; 
    }
}