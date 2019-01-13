/*
 * ������������������дһ�����������������Ƿ���ͬ��

����������ڽṹ����ͬ�����ҽڵ������ͬ��ֵ������Ϊ��������ͬ�ġ�

ʾ�� 1:

����:       1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

���: true
ʾ�� 2:

����:      1          1
          /           \
         2             2

        [1,2],     [1,null,2]

���: false
ʾ�� 3:

����:       1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

���: false
 */
public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null){
	        return true;
	    }
	    if(p!=null && q!=null && p.val==q.val  ){
	        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	    }else {
	        return false;
	    }
    }
}
