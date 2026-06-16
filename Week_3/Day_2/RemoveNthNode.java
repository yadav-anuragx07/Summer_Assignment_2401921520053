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
        if(head == null){
            return head;
        }
        int l = 1;
        ListNode node = head;
        ListNode temp = head;
        while(node.next != null){
            node = node.next;
            l++;
        }
        if (n == l) {
            return head.next;
        }
        for(int i = 0;i < l-n-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
