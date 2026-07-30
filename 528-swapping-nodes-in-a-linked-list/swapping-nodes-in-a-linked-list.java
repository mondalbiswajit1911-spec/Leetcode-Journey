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
    public ListNode swapNodes(ListNode head, int k) {
        int jumps1 = k-1;
        int len = 0;

        ListNode curr = head;

        while(curr != null){
            len = len + 1;
            curr  = curr.next;
        }

        ListNode n1 = head;
        int count = 0;

        while(count < jumps1){
            count++;
            n1 = n1.next;
        }
        count = 0;
        int jumps2 = len -k;
        ListNode n2 = head;
        while(count < len-k){
            count++;
            n2 = n2.next;
        }

        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;

        return head;


    }
}