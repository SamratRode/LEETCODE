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
        ListNode ptrA=headA;
        
        while(ptrA!=null){
            ListNode ptrB=headB;
            while(ptrB!=null){
                if(ptrA==ptrB){
                    return ptrA;
                }
                ptrB=ptrB.next;
            }
            ptrA=ptrA.next;
        }
        return null;
    }
}