package datastructure.tree;

/**
 * 
 */
public class isBalancedTree {
      public  boolean isBalanced(TreeNode root){
          return  isBST(root).isB;
      }
   class ReturnNode{
       boolean isB;
       int depth;
       public ReturnNode(int depth,boolean isB){
           this.depth=depth;
           this.isB=isB;
        }
    }
 public ReturnNode isBST(TreeNode root){
       if(root==null){
           return new ReturnNode(0,true);
       }
       ReturnNode left=isBST(root.left);
       ReturnNode right=isBST(root.right);
       if(left.isB==false||right.isB==false){
           return  new ReturnNode(0,false);
       }
       if(Math.abs(left.depth-right.depth)>1){
           return new ReturnNode(0,false);
       }
       return  new ReturnNode(Math.max(left.depth,right.depth)+1,true);
 }
}
