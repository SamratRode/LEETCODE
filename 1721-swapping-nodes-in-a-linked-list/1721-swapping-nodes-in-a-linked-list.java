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
        ListNode temp1=head;
        for(int i=1;i<k;i++){
            temp1=temp1.next;
        }
        //temp1
        ListNode slow=head;
        ListNode fast=head;
        while(k>0){
            fast=fast.next;
            k--;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int temp=slow.val;
        slow.val=temp1.val;
        temp1.val=temp;
        return head;
        
    }
    
}