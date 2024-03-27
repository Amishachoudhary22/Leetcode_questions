//remove nth node from the last
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode mainptr = head;
        ListNode refptr = head;
        ListNode prev = null;
        int count = 1;
  
        while(count < n) {
            // if (refptr == null) {
               
            //     return null; 
            // }
            refptr = refptr.next;
            count++;
        }
        
        
        // if (refptr == null) {
        //     return head.next;
        // }
        
      
        while (refptr.next != null) {
            refptr = refptr.next;
            prev = mainptr;
            mainptr = mainptr.next;
        }
        
       
        if (prev == null) { 
            head = head.next;
        } else {
            prev.next = mainptr.next;
        }
        
        return head;
    }
}
