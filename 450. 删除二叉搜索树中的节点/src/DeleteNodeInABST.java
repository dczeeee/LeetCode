/*
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。

一般来说，删除节点可分为两个步骤：

首先找到需要删除的节点；
如果找到了，删除它。
说明： 要求算法时间复杂度为 O(h)，h 为树的高度。

示例:

root = [5,3,6,2,4,null,7]
key = 3

    5
   / \
  3   6
 / \   \
2   4   7

给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。

一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。

    5
   / \
  4   6
 /     \
2       7

另一个正确答案是 [5,2,6,null,4,null,7]。

    5
   / \
  2   6
   \   \
    4   7
 */
public class DeleteNodeInABST {

	public static void main(String[] args) {
		

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
        	if(root.left == null) {//左子树不存在，返回右节点作为根
        		return root.right;
        	}
        	else if(root.right == null) {//右子树不存在，返回左节点作为根
        		return root.left;
        	}
        	else {//都存在
        		TreeNode successor = min(root.right);
        		successor.right = deleteMin(root.right);
        		successor.left = root.left;
        		return successor;
        	}
        }
    }
	// 寻找最左结点
	private TreeNode min(TreeNode node) {
		if(node.left == null)
			return node;
		return min(node.left);
	}
	// 删除最左结点后，重构右子树
	private TreeNode deleteMin(TreeNode node) {
		if(node.left == null) {
			return node.right;
		}
		node.left = deleteMin(node.left);
		return node;
	}
}
