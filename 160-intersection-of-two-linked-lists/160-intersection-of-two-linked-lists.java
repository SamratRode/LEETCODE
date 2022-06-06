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
        HashSet<ListNode> set=new HashSet<ListNode>();
        while(ptrA!=null){
            set.add(ptrA);
            ptrA=ptrA.next;
        }
        
        ListNode ptrB=headB;
        
        while(ptrB!=null){
            if(set.contains(ptrB)){
                return ptrB;
            }
            ptrB=ptrB.next;
        }
        return null;
    }
}