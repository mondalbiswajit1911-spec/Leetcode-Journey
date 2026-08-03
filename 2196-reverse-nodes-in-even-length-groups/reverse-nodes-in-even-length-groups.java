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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int len  = 0;
        int groupSize = 1;

        ListNode curr = head;

        while(curr != null){
            len++;
            curr = curr.next;
        }
        curr = head;
        ListNode prev = null;
        ListNode p = null;
        while(curr != null){
            int actualGroupSize = Math.min(groupSize, len);
            
            // precessing
            if(actualGroupSize % 2 == 0){
                //reverse
                int count = 0;
                ListNode temp = curr;

                while(count < actualGroupSize){
                    count++;
                    ListNode next = curr.next;

                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                p.next = prev;
                temp.next = curr;

                p =temp;

            }else{
                //skip
                int count = 0;
                while(count < actualGroupSize){
                    count++;
                     p = curr;
                    curr = curr.next;
                }
            }
            groupSize++;
            len = len -actualGroupSize;
        }

        return head;
    }
}