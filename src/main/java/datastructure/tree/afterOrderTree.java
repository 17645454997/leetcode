package datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class afterOrderTree {

    public List<Integer> postTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        //模版化判空操作
        if (root == null) {
            return list;
        }
        postorder(root, list);
        return list;
    }

    public void postorder(TreeNode root, List<Integer> list) {

        if (root != null) {
            //模版化递归
            postorder(root.left, list);
            //具体的逻辑
            list.add(root.val);
            postorder(root.right, list);
        }
    }


}
