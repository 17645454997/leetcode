package datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hejiaxing
 * @desc 二叉树层序遍历框架
 * 两个队列 两个数组 树结构   剩下就是增删改查
 * 两个While 循环
 */

public class levelOrderTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue1 = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root != null) {
            queue1.add(root);
            while (!queue1.isEmpty()) {
                LinkedList<TreeNode> queue2 = new LinkedList<>();
                List<Integer> nodeList = new ArrayList<>();
                while (!queue1.isEmpty()) {
                    TreeNode pRoot = queue1.poll();
                    if (pRoot.left != null) {
                        queue2.add(pRoot.left);
                    }
                    if (pRoot.right != null) {
                        queue2.add(pRoot.right);
                    }
                    nodeList.add(pRoot.val);
                }
                queue1 = queue2;
                list.add(nodeList);
            }
        }
        return list;
    }


}
