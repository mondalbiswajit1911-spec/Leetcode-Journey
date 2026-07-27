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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode crr = head;
        ListNode prev = dummy;

       while(crr!=null){
        if(crr.val == val){
            prev.next = crr.next;
            crr = crr.next;
        }
        else{
            prev = crr;
            crr = crr.next;
        }
       }
       return dummy.next;
    }
}
