package com.company.leetcode.add_two_numbers;

public class AddTwoNumbers {

  public static void main(String[] args) {
    // Create the first linked list: l1 = [2, 4, 3]
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    // Create the second linked list: l2 = [5, 6, 4]
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    AddTwoNumbers solution = new AddTwoNumbers();
    ListNode result = solution.addTwoNumbers(l1, l2);

    while (result != null) {
      System.out.print(result.val + " ");
      result = result.next;
    }
    System.out.println();
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    int carry = 0;
    while (l1 != null || l2 != null || carry == 1) {
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry;
      carry = sum / 10;
      ListNode node = new ListNode(sum % 10);
      curr.next = node;
      curr = curr.next;
    }
    return dummy.next;
  }
}
