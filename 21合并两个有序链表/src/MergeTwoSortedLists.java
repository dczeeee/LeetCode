/*
 * ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 

ʾ����

���룺1->2->4, 1->3->4
�����1->1->2->3->4->4
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode ln = new ListNode(0);
        ListNode tmp = ln;
        while(l1 != null && l2 != null) {
        	if(l1.val < l2.val) {
        		tmp.next = l1;
        		tmp = tmp.next;
        		l1 = l1.next;
        	}
        	else {
        		tmp.next = l2;
        		tmp = tmp.next;
        		l2 = l2.next;
        	}
        }
        if (l1 == null) {
            tmp.next = l2;
        } 
        else {
            tmp.next = l1;
        }
        return ln.next;
    }
}
