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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[] = new ListNode[k];
        ListNode curr = head;
        int len =0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        int divisorVal = len/k;
        int remanderVal = len%k;
        
        curr = head;
    for(int i = 0; i<Math.min(k, len);i++){
        int  size = divisorVal;
      if(remanderVal > 0){
        size++;
        remanderVal--;
      }
      int count = 1;
      ListNode prev = curr;
      curr = prev.next;
      while(count<size){
        prev = prev.next;
        curr = curr.next;
        count++;
      }
      if(prev.next != null){
        prev.next = null;
      }
      arr[i]= head;
      head = curr;
    }
    return arr;

    }
}