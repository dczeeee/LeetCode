/*
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�

ʾ�� 1:

����: 1->1->2
���: 1->2
ʾ�� 2:

����: 1->1->2->3->3
���: 1->2->3
 */
public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null && cur.next != null) {
        	if(cur.next.val == cur.val) {
        		cur.next = cur.next.next;
        	}else {
        		cur = cur.next;
        	}
        }
        return head;
    }
}
