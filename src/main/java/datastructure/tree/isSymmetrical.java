package datastructure.tree;


/**
 * @author  hejiaxing
 * @desc  判断镜像二叉树框架
 * 分为左右两边分别判断左右是否为镜像二叉树
 *
 */

public class isSymmetrical {

    boolean isSymmetrical(TreeNode pRoot){
       return getResult(pRoot,pRoot);
    }

    private boolean getResult(TreeNode pRoot, TreeNode Root) {
        if(pRoot==null&& Root==null){
            return  true;
        }
        if(pRoot==null||Root==null){
            return  false;
        }
        if(pRoot.val!=Root.val){
            return  false;
        }
        return getResult(pRoot.left,Root.right)&&getResult(pRoot.right,Root.left);
    }


}
