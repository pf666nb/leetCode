package leetcode.Binarytree;

/**
 * leetCode
 * 翻转二叉树 https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * @author : wpf
 * @date : 2021-05-16 11:15
 *      4
 *    /   \
 *   2     7  ---》
 *  / \   / \
 * 1   3 6   9
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 **/
public class invertbinarytree {
    public TreeNode invertTree(TreeNode root){
        if (root==null) {
            return null;
        }
        /**** 前序遍历位置 ****/
        // root 节点需要交换它的左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
