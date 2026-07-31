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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode c1 =head,
        c2 = head.next;
        ListNode temp1 = c2;

        while(c2 != null && c2.next !=null){
            c1.next = c2.next;
            c1 = c1.next;
            c2.next = c1.next;
            c2  = c2.next;
        }
        c1.next = temp1;
        return head;
    }
}