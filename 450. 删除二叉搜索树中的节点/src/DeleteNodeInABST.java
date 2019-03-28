/*
 * ����һ�������������ĸ��ڵ� root ��һ��ֵ key��ɾ�������������е� key ��Ӧ�Ľڵ㣬����֤���������������ʲ��䡣���ض������������п��ܱ����£��ĸ��ڵ�����á�

һ����˵��ɾ���ڵ�ɷ�Ϊ�������裺

�����ҵ���Ҫɾ���Ľڵ㣻
����ҵ��ˣ�ɾ������
˵���� Ҫ���㷨ʱ�临�Ӷ�Ϊ O(h)��h Ϊ���ĸ߶ȡ�

ʾ��:

root = [5,3,6,2,4,null,7]
key = 3

    5
   / \
  3   6
 / \   \
2   4   7

������Ҫɾ���Ľڵ�ֵ�� 3���������������ҵ� 3 ����ڵ㣬Ȼ��ɾ������

һ����ȷ�Ĵ��� [5,4,6,2,null,null,7], ����ͼ��ʾ��

    5
   / \
  4   6
 /     \
2       7

��һ����ȷ���� [5,2,6,null,4,null,7]��

    5
   / \
  2   6
   \   \
    4   7
 */
public class DeleteNodeInABST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
        	return null;
        }
        if(key < root.val) {
        	root.left = deleteNode(root.left, key);
        	return root;
        }
        else if(key >root.val) {
        	root.right = deleteNode(root.right, key);
        	return root;
        }
        else {
        	if(root.left == null) {//�����������ڣ������ҽڵ���Ϊ��
        		return root.right;
        	}
        	else if(root.right == null) {//�����������ڣ�������ڵ���Ϊ��
        		return root.left;
        	}
        	else {//������
        		TreeNode successor = min(root.right);
        		successor.right = deleteMin(root.right);
        		successor.left = root.left;
        		return successor;
        	}
        }
    }
	// Ѱ��������
	private TreeNode min(TreeNode node) {
		if(node.left == null)
			return node;
		return min(node.left);
	}
	// ɾ����������ع�������
	private TreeNode deleteMin(TreeNode node) {
		if(node.left == null) {
			return node.right;
		}
		node.left = deleteMin(node.left);
		return node;
	}
}
