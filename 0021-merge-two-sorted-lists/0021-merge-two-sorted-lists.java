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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        java.util.List<Integer> values = new java.util.ArrayList<>();
        ListNode current = list1;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        current = list2;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        java.util.Collections.sort(values);

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        for (int val : values) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return dummyHead.next;
    }
}