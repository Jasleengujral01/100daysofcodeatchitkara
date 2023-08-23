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
    public ListNode detectCycle(ListNode head) {
       
        ListNode slow=head;
        ListNode fast=head;
        boolean hascycle=false;
        if(head==null||head.next==null){
            return null;
        }
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                hascycle=true;
                break;
            }
        }
        if(!hascycle){
            return null;
        }
            
         ListNode temp = head;
            while(temp!=slow){
                temp=temp.next;
                slow=slow.next;
            }
        return slow;
        }
  
    }
