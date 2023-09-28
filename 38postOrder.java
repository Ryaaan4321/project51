package striver.Treee;

import java.util.ArrayList;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class postorderT {
    public static void postOrderTrav(TreeNode curr, ArrayList<Integer> postorder) {
        if (curr == null)
            return;

        postOrderTrav(curr.left, postorder);
        postOrderTrav(curr.right, postorder);
        postorder.add(curr.data);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Create an ArrayList to store the post-order elements
        ArrayList<Integer> postOrderElements = new ArrayList<>();

        // Perform post-order traversal and add elements to the ArrayList
        postOrderTrav(root, postOrderElements);

        // Print the post-order elements
        System.out.println("Post-order elements: " + postOrderElements);
    }
}

