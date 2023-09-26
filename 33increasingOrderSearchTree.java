/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        TreeNode ans= new TreeNode();
        TreeNode ansroot=ans;
    public TreeNode increasingBST(TreeNode root) {
            inorder(root);
            return ansroot.right;
        }
        void inorder(TreeNode node){
            if(node == null){
                return;
            }

            inorder(node.left);
            ans.right=new TreeNode(node.val);
            ans=ans.right;
            inorder(node.right);
        

    }
}
