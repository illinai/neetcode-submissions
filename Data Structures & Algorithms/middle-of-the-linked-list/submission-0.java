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
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode cur = head;

        while (cur != null) {
            cur = cur.next;
            n++;
        }

        n = n/2;

        while (n != 0) {
            head = head.next;
            n--;
        }
        return head;
    }
}