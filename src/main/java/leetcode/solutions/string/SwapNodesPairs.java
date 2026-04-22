package leetcode.solutions.string;

public class SwapNodesPairs {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;


        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Step 3: Swap
            first.next = second.next;
            second.next = first;
            current.next = second;


            current = first;
        }

        return dummy.next;
    }
}
