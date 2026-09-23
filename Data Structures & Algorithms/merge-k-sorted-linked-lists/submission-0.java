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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> sort = new ArrayList<>();
        for(ListNode l : lists){
            while(l != null){
                sort.add(l.val);
                l = l.next;
            }
        }
        Collections.sort(sort);

        ListNode res = new ListNode(0);
        ListNode cur = res;
        for (int s : sort) {
            cur.next = new ListNode(s);
            cur = cur.next;
        }
        return res.next;
    }
}
