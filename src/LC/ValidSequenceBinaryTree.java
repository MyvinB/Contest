package LC;

import java.util.Stack;

/*
 @author Myvin Barboza
 01/05/20 8:34 AM 
 */public class ValidSequenceBinaryTree {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        return isValidSequence(root,arr,0);
    }

    public boolean isValidSequence(TreeNode root, int[] arr,int i) {
        if(root==null || i>=arr.length) return false;
        if(root.left==null && root.right==null && root.val==arr[i] && i==arr.length-1){
            return  true;
        }

        if(arr[i]!=root.val) return false;
        return isValidSequence(root.left,arr,i+1) || isValidSequence(root.right,arr,i+1);


    }

     public static void main(String[] args) {
        TreeNode t=new TreeNode(2);

    }
}