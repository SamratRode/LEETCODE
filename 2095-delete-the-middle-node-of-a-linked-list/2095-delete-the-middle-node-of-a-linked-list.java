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
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
            
        }
        temp=head;
        if(size==1){
            return head.next;
        }
        int s=size/2;
        while(s>1){
            temp=temp.next;
            s--;
        }
        temp.next=temp.next.next;
        return head;
    }
}