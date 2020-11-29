package datastructure.tree;

/**
 * @author hejiaxing
 * @desc 路径和算法框架
 * 自顶向下
 * 设置一个值存储
 * 本质是先序遍历
 * <p>
 * 如果该结点的左孩子不为空，继续向下遍历到最后一层
 * 考虑一个根结点和他的左右孩子的状态
 *
 */

public class hasPathSumTree {


    public boolean hasPathSumHelper(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        // 递归遍历左右孩子结点 判断路径和
        return hasPathSumHelper(root.left, sum - root.val) || hasPathSumHelper(root.right, sum - root.val);
    }


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {

            return getNode(inorder, postorder, 0, inorder.length - 1, inorder.length - 1);
        }

        /**
         * 获取节点<hr>
         * 中序：左->根->右<br>
         * 后序：左->右->根<br>
         * <p>
         * 根据规律:通过后序找到根节点，通过中序分辨左右<br><hr>
         * 实现方式：使用三个指针分别记录中序的开始到结束，及其中根节点在后序中的位置<br>
         * 原始：中序开始instart(0),中序结束inend(len-1),后序postend(len-1)；<br>
         * 找到中序根位置index,此时我们可以知道：
         * - 左子树（0，index),根->新postend(原postend-右子树长度（inend-index)-自己（1）），此时获取左子树的根节点就是当前根节点的左节点
         * - 右子树（index+1,inend),根->新postend(原postend-1)
         *
         * @param inorder   中序数组
         * @param postorder 后序数组
         * @param instart   中序开始指向
         * @param inend     中序结束指向
         * @param postend   指向根节点在后序数组的下标
         * @return TreeNode
         */
        public TreeNode getNode(int[] inorder, int[] postorder, int instart, int inend, int postend) {
            // 结束条件，开始大于结束
            if (instart > inend) {
                return null;
            }
            // 节点值
            int nodeVal = postorder[postend];
            //  当前节点
            TreeNode node = new TreeNode(nodeVal);
            // 节点中中序数组中的下标
            int nodeIndex = 0;
            for (int i = instart; i <= inend; i++) {
                if (nodeVal == inorder[i]) {
                    nodeIndex = i;
                    break;
                }
            }
            // 左子树（0，index),根->新postend(原postend-右子树长度（inend-index)-自己（1））
            node.left = getNode(inorder, postorder, instart, nodeIndex - 1, postend - (inend - nodeIndex) - 1);
            // 右子树（index+1,inend),根->新postend(原postend-1)
            node.right = getNode(inorder, postorder, nodeIndex + 1, inend, postend - 1);
            return node;
        }
    }


}
