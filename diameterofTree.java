package striver.Treee;

// :  https://leetcode.com/problems/diameter-of-binary-tree/

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        left = null;
        right = null;
        
        this.val = val;
    }

}

public class diametreoftree {
    public static int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];
        height(root, diameter);
        return diameter[0];

    }

    public static int height(TreeNode node, int diametre[]) {
        if (node == null)
            return 0;
        int lh = height(node.left, diametre);
        int rh = height(node.right, diametre);

        diametre[0] = Math.max(diametre[0], lh + rh);
        return 1 + Math.max(lh, rh);

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


        int ans = diameterOfBinaryTree(root);
        System.out.println(ans);
    }

}
