class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode current = head;
        
        // Calculate the length of the linked list
        while (current != null) {
            current = current.next;
            length++;
        }
        
        int baseSize = length / k;     // Base size for each part
        int extraSizeCount = length % k; // Number of parts with extra size
        
        ListNode[] parts = new ListNode[k];
        current = head;
        
        for (int i = 0; i < k; i++) {
            parts[i] = current;
            int partSize = baseSize + (i < extraSizeCount ? 1 : 0);
            
            // Traverse to the end of the current part
            for (int j = 1; j < partSize && current != null; j++) {
                current = current.next;
            }
            
            // If we haven't reached the end of the list, break the link
            if (current != null) {
                ListNode next = current.next;
                current.next = null;
                current = next;
            }
        }
        
        return parts;
    }
}
