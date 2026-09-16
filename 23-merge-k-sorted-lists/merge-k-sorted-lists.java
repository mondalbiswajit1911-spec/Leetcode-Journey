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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy =new  ListNode(0);
        ListNode curr = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
        }
        if(list1== null){
            curr.next = list2;
        }else{
            curr.next  =list1;
        }
        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        while(lists.length > 1){
            int count = lists.length %2==0 ? lists.length/2 : (lists.length+1)/2;
            ListNode[] nextround = new ListNode[count];

            for(int p = 0, k =0; p < lists.length; p=p+2,k++){
                if(p+1 < lists.length){
                    nextround[k] = mergeTwoLists(lists[p],lists[p+1]);
                }
                else{
                    nextround[k] = lists[p];
                }
            }
            lists = nextround;
        }
        return lists[0];
    }
}