/*
 * ����һ�����������������������¶ȡ�

һ�����Ľڵ���¶ȶ��弴Ϊ���ýڵ��������Ľ��֮�ͺ����������֮�͵Ĳ�ľ���ֵ���ս��ĵ��¶���0��

���������¶Ⱦ��������нڵ���¶�֮�͡�

ʾ��:

����: 
         1
       /   \
      2     3
���: 1
����: 
�����¶� 2 : 0
�����¶� 3 : 0
�����¶� 1 : |2-3| = 1
�����¶� : 0 + 0 + 1 = 1
ע��:

�κ������Ľ��ĺͲ��ᳬ��32λ�����ķ�Χ��
�¶ȵ�ֵ���ᳬ��32λ�����ķ�Χ��
 */
public class BinaryTreeTilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	int tilt = 0;
	public int findTilt(TreeNode root) {
        traverse(root);
        return tilt;
    }
	
	public int traverse(TreeNode root) {
		if(root == null)
			return 0;
		int left = traverse(root.left);
		int right = traverse(root.right);
		tilt += Math.abs(left-right);
		return root.val+left+right;
	}
}
//ΪʲôҪ����root.val+left+right������������������