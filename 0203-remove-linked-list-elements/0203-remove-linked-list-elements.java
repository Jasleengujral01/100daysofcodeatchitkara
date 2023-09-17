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
    public ListNode removeElements(ListNode head, int val) {
   
        if(head==null){
            return null;
        }else if(head.next==null && head.val==val){
            return null;
        }
                

        while(head!=null && head.val == val) {
            head = head.next;

            if(head==null){
                return head;
            }
        }

        ListNode temp=head;
        temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val==val || temp.next.val==val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        

        return head;
    }
}