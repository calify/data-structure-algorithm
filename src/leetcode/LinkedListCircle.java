package leetcode;

public class LinkedListCircle {

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  static class Solution {
    public ListNode detectCycle(ListNode head) {
      if (head == null) {
        return null;
      }

      ListNode fast = head;
      ListNode slow = head;

      while (true) {
        if (fast.next == null || fast.next.next == null) {
          return null;
        } // end if
        fast = fast.next.next;
        slow = slow.next;

        if (fast == slow) {
          fast = head;
          while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
          } // end while
          return fast;
        } // end if
      } // end while
    }
  }// end class Solution

}
