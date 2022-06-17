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
        HashSet<ListNode> hs=new HashSet<ListNode>();
        ListNode l=head;
        while(l!=null){
            if(hs.contains(l)){
                return true;
            }
            hs.add(l);
            l=l.next;
        }
        return false;
    }
}