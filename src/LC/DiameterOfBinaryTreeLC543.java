package LC;

/*
 @author Myvin Barboza
 11/04/20 1:11 PM

 */


 // Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }




public class DiameterOfBinaryTreeLC543 {
    int max=0;
    int diameterOfBinaryTree(TreeNode root) {

    calHeight(root);
    return max;
    }

    int calHeight(TreeNode root){
        if(root==null)return 0;
        int left=calHeight(root.left);
        int right=calHeight(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }


    public static void main(String[] args) {
    DiameterOfBinaryTreeLC543 ins=new DiameterOfBinaryTreeLC543();

        TreeNode l=new TreeNode(1);
    l.left=new TreeNode(2);
    l.left.left=new TreeNode(4);
    l.left.right=new TreeNode(5);
    l.right=new TreeNode(3);
        System.out.println(ins.diameterOfBinaryTree(l));
    }
}