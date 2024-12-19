package leetcode;

import bean.ListNode;

public class Problem21MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;
		
		while(list1 != null && list2 != null) {
			if(list1.getVal() <= list2.getVal()) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		if(list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}
		
		return dummy.next;
	}
	
}
