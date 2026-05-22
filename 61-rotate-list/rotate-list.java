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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int len = 1;

        while(temp.next != null){
            temp = temp.next;
            len++;
        }
        k = k % len;
        
        temp.next = head;
        int node_before_newHead = len - k;
        ListNode newTail = head;

        for(int i = 0; i < node_before_newHead - 1; i++){
            System.out.print(newTail.val + "->");
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        System.out.print(newHead.val);
        newTail.next = null;

        return newHead;
    }
}