/*
 * ����һ�����������ҳ��������ȡ�

�����������Ϊ���ڵ㵽��ԶҶ�ӽڵ���·���ϵĽڵ�����

˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣

ʾ����
���������� [3,9,20,null,null,15,7]��

    3
   / \
  9  20
    /  \
   15   7
�������������� 3 ��
 */
public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int left_height = maxDepth(root.left);
			int right_height = maxDepth(root.right);
			return Math.max(left_height, right_height) + 1;
		}
    }
}
