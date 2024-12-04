import java.util.ArrayList;
import java.util.List;

public class LeetCode0206 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int[] input) {
        if (input != null && input.length != 0) {
            this.val = input[0];
            ListNode curr = this;
            for (int i = 1; i < input.length; i++) {
                curr.next = new ListNode(input[i]);
                curr = curr.next;
            }
        }
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int[] asArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return LeetCodeUtils.toIntArray(list);
    }
}