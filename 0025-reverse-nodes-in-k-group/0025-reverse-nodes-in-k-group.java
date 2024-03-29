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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> st= new Stack<Integer>();
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode start = null;
        while(head!=null){
            if(st.size() == 0){
                start=head;
            }
            st.push(head.val);
            if(st.size()==k){
                while(!st.isEmpty()){
                    ListNode nn = new ListNode(st.pop());
                    dummy.next=nn;
                    dummy=dummy.next;
                }
            }
            head=head.next;
        }
        if(st.size() > 0)
            dummy.next=start;
        
        return temp.next;
        
    }
}