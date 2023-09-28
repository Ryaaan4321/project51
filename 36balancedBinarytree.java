package striver.Treee;
//  https://leetcode.com/problems/balanced-binary-tree/description/


class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class balancedBinarytree {
    public static  boolean isBalanced(TreeNode root) {
        return dfsheight(root) != -1;
    }

     static int dfsheight(TreeNode root) {
        if (root == null)
            return 0;

        int leftheight = dfsheight(root.left);
        if (leftheight == -1)
            return -1;
        int rightheight = dfsheight(root.right);
        if (rightheight == -1)
            return -1;

        if (Math.abs(leftheight - rightheight) > 1)
            return -1;
        return Math.max(leftheight, rightheight) + 1;

    }
    public static void main(String[]args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(9);
        
        boolean ans =  isBalanced(root) ;
        System.out.println(ans + " this binary tree is a balanced binary tree !...");
    }

}
