class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        // Count the length of the linked list
        int length = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        
        // Calculate the actual rotation amount
        int rotation = k % length;
        if (rotation == 0) {
            return head;
        }
        
        // Find the new tail node and break the list
        ListNode oldTail = current;
        current = head;
        for (int i = 1; i < length - rotation; i++) {
            current = current.next;
        }
        ListNode newHead = current.next;
        current.next = null;
        oldTail.next = head;
        
        return newHead;
    }
}
