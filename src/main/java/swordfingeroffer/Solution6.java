package swordfingeroffer;

public class Solution6 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length <= 0 || preorder == null) {
            return null;
        }
        int len = preorder.length;
        // 定义递归退出条件前序数组中只剩下一个元素了，说明已经是叶子结点了可以退出了
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            root.left = null;
            root.right = null;
            return root;
        }
        int flag = 0;
        //定位根结点的位置 在中序遍历中的位置
        for (int i = 0; i < len; i++) {
            if (preorder[0] == inorder[i]) {
                flag = i;
            }
        }
        if (flag > 0) {
            int preLeft[] = new int[flag];
            int inLeft[] = new int[flag];
            // 重建左子树
            for (int i = 0; i < flag; i++) {
                preLeft[i] = preorder[i + 1];
                inLeft[i] = inorder[i];
            }
            buildTree(preLeft, inLeft);
        } else {
            root.left = null;
        }
        if (len - flag - 1 > 0) {
            int preRight[] = new int[len - flag - 1];
            int inRight[] = new int[len - flag - 1];
            //重建右子树
            for (int j =flag+1; j < len; j++) {
                preRight[j-flag-1] = preorder[j];
                inRight[j-flag-1] = inorder[j];
            }
            buildTree(preRight, inRight);
        } else {
            root.right = null;
        }
        return root;
    }




    public static void main(String[] args) {

    }
}
