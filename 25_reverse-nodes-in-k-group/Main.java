
public class Main {

    public static void main(String[] args) {
        // [1,2,3,4,5]
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(1);
        head = reverseKGroup(head, 3);
        // out put the node val
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1) {
            return head;
        }
        var end = head;
        for (int j = k; j > 0; j--) {
            if (end == null)
                return head;
            end = end.next;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode next = null;
        var len = k;
        while (fast != end) {
            next = fast.next;
            fast.next = slow;
            slow = fast;
            fast = next;
        }
        head.next = reverseKGroup(next, len);
        return slow;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
