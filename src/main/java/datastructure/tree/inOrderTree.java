package datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class inOrderTree {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        //模版化判空操作
        if (root == null) {
            return list;
        }
        inorder(root, list);
        return list;
    }

    public void inorder(TreeNode root, List<Integer> list) {

        if (root != null) {
            //模版化递归
            inorder(root.left, list);
            //具体的逻辑
            list.add(root.val);
            inorder(root.right, list);
        }
    }


}
