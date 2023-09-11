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
    public ListNode deleteDuplicates(ListNode head) {
       
    if (head == null || head.next == null) {
        return head;
    }

    ListNode dummy = new ListNode(-1); // Create a dummy node to simplify edge cases
    dummy.next = head;
    ListNode prev = dummy;
    ListNode current = head;

    while (current != null) {
        boolean isDuplicate = false;

        while (current.next != null && current.val == current.next.val) {
            current = current.next;
            isDuplicate = true;
        }

        if (isDuplicate) {
            prev.next = current.next; // Skip nodes with duplicates
        } else {
            prev = prev.next; // Move to the next distinct node
        }

        current = current.next;
    }

    return dummy.next; // Return the sorted, deduplicated linked list starting from the next of the dummy node
}

}