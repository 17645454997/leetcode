package datastructure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hejiaxing
 * @desc 二叉树前序遍历模版
 * 返回值 和入参 不符的时候一般采用辅助方法
 */

public class preOrderTree {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        //模版化判空操作
        if (root == null) {
            return list;
        }
        preorder(root, list);
        return list;
    }

    public void preorder(TreeNode root, List<Integer> list) {

        if (root != null) {
            //具体的逻辑
            list.add(root.val);
            //模版化递归
            preorder(root.left, list);
            preorder(root.right, list);
        }
    }


}
