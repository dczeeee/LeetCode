/*
 * ����һ�����������ҳ�����С��ȡ�

��С����ǴӸ��ڵ㵽���Ҷ�ӽڵ�����·���ϵĽڵ�������

˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣

ʾ��:

���������� [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
����������С���  2.
 */
public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int minDepth(TreeNode root) {
		if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
