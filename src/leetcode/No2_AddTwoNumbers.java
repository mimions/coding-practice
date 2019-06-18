package leetcode;

import java.util.*;

public class No2_AddTwoNumbers {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(5);
		n1.next = n2; n2.next = n3; n3.next = n4;
		
		ListNode n5 = new ListNode(2);
		ListNode n6 = new ListNode(4);
		ListNode n7 = new ListNode(7);
		n5.next = n6; n6.next = n7;
		
		ListNode n = addTwoNumbers(n1,n5);
		while (n!=null) {
			System.out.print(n.val + "->");
			n = n.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
        	int n1 = l1 == null ? 0 : l1.val;
        	int n2 = l2 == null ? 0 : l2.val;
        	int sum = n1 + n2 + carry;
        	
        	carry = sum / 10;
        	ListNode digit = new ListNode(sum % 10);
        	head.next = digit;
        	head = head.next;
        	
        	if (l1 != null) l1 = l1.next;
        	if (l2 != null) l2 = l2.next;
        }
        
        return dummy.next;
    }
}
