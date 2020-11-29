package datastructure.tree;
/**
 * @author  hejiaxing
 * @desc  求二叉树深度框架
 * 两种方式
 * 1.自顶向下   本质是前序遍历
 * 2.自底向上   本质是后序遍历
 */

public class maxDepthTree {
    int anwser;
    public int maxDepth(TreeNode root) {
        return  maxDepth(root,1);
       // return  maxDepth1(root,1);
    }
    //自顶向下的实现方案 本质是前序遍历
    public int maxDepth(TreeNode root,int depth){
         if(root==null){
             return  0;
         }
         if(root.left==null&&root.right==null){
             anwser=Math.max(anwser,depth);
         }
         maxDepth(root.left,depth+1);
         maxDepth(root.right,depth+1);
         return  anwser;
    }
    //自底向上的实现方案  本质是后序遍历
    public int maxDepth1(TreeNode root,int depth){
        if(root==null){
            return  0;
        }
       int left= maxDepth(root.left,depth);
       int right=maxDepth(root.right,depth);

        return  Math.max(left,right)+1;
    }


}
