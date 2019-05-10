/*
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class ListNode {
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
        ListNode q = head;
        for(int i = 0;i < n;++i) {
        	p = p.next;
        }
        if(p == null)
        	return q.next;
        while(p.next != null) {
        	p = p.next;
        	q = q.next;
        }
        q.next = q.next.next;
        return head;
    }
}
