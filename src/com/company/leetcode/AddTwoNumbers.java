package com.company.leetcode;

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
    ListNode dummy = new ListNode(0); // creating an dummy list
    ListNode curr = dummy; // intialising an pointer
    int carry = 0; // intialising our carry with 0 intiall
    // while loop will run, until l1 OR l2 not reaches null OR if they both reaches null. But our carry has some value in it.
    // We will add that as well into our list
    while (l1 != null || l2 != null || carry == 1) {
      int sum = 0; // intialising our sum
      if (l1 != null) { // adding l1 to our sum & moving l1
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) { // adding l2 to our sum & moving l2
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry; // if we have carry then add it into our sum
      carry = sum / 10; // if we get carry, then divide it by 10 to get the carry
      ListNode node = new ListNode(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it to our list
      curr.next = node; // curr will point to that new node if we get
      curr = curr.next; // update the current every time
    }
    return dummy.next; // return dummy.next bcz, we don't want the value we have consider in it intially!!
  }
}

class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
