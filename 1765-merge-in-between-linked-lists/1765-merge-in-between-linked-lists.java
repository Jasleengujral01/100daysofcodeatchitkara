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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       ListNode dummy=new ListNode(-1);
       dummy.next=list1;
       ListNode prev=dummy;
       for(int i=0;i<a;i++){ //move the prev node to ath node
           prev=prev.next;
       } 
       ListNode curr =prev ; //move curr to the node after b
       for(int i=a;i<=b+1;i++){
           curr=curr.next;
       }
       prev.next=list2; //connect nodes before a to list2
       while(list2.next!=null){ //find last node of list2 and connect it to the nodes after bn 
           list2=list2.next;
       }
       list2.next=curr;
       return dummy.next;
    }
}