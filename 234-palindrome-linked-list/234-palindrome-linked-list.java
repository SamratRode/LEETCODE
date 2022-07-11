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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        for(int i=0;i<al.size()/2;i++){
            if(al.get(i)!=al.get(al.size()-i-1)){
                return false;
            }
        }
        return true;
    }
}