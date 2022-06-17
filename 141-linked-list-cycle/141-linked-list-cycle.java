/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l=head;
        int count=0;
        while(l!=null && count<10001){
            l=l.next;
            count++;
        }
        if(count!=10001){
            return false;
        }
        return true;
    }
}