/*
 * ����һ����������������Ƿ��Ǿ���ԳƵġ�

���磬������ [1,2,2,3,4,4,3] �ǶԳƵġ�

    1
   / \
  2   2
 / \ / \
3  4 4  3
����������� [1,2,2,null,3,null,3] ���Ǿ���ԳƵ�:

    1
   / \
  2   2
   \   \
   3    3
˵��:

�����������õݹ�͵������ַ������������⣬��ܼӷ֡�
 */
public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}
	public boolean isMirror(TreeNode t1,TreeNode t2) {
		if(t1 == null && t2 == null)	return true;
		if(t1 == null || t2 == null)	return false;
		return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
	}
}
