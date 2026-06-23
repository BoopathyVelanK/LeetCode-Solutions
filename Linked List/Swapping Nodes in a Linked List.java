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
        ListNode first=head;
        ListNode second=head;
        
        for(int i=1;i<k;i++){
            first=first.next;
        }

        ListNode start=first;

        while(first.next!=null){
            first=first.next;
            second=second.next;
        }

        int swap=second.val;
        second.val=start.val;
        start.val=swap;
        return head;
    }
}
