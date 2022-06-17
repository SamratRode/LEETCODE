/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0;
        ListNode l1=headA;
        while(l1!=null){
            size1++;
            l1=l1.next;
        }
        l1=headA;
        
        int size2=0;
        ListNode l2=headB;
        while(l2!=null){
            size2++;
            l2=l2.next;
        }
        l2=headB;
        if(size1>size2){
            int diff=size1-size2;
            while(diff>0){
                l1=l1.next;
                diff--;
            }
        }
        else{
            int diff=size2-size1;
            while(diff>0){
                l2=l2.next;
                diff--;
            }
        }
        while(l1!=null && l2!=null){
            if(l1==l2){
                return l1;
            }
            else{
                l1=l1.next;
                l2=l2.next;
            }
        }
        return l1;
    }
}