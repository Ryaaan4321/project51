// package striver.Treee;

// import java.util.*;

// class TreeNode {
//     int data;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int data) {
//         this.data = data;
//         right = null;
//         left = null;
//     }
// }

// public class levelorder {
//     public static List<List<Integer>> levelOrder(TreeNode root) {
//         Queue<TreeNode> queue = new LinkedList<>();
//         List<List<Integer>> ans = new LinkedList<>();

//         if (root == null)
//             return ans;
//         queue.add(root);

//         while (queue.size() != 0) {
//             int level = queue.size();
//             List<Integer> sublist = new LinkedList<>();

//             for (int i = 0; i < level; i++) {
//                 TreeNode node = queue.poll();
//                 sublist.add(node.data);

//                 if (node.left != null)
//                     queue.add(node.left);
//                 if (node.right != null)
//                     queue.add(node.right);
//             }
//             ans.add(sublist);
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(7);

//         // Create an ArrayList to store the level -order elements
//         List<List<Integer>> levelOrderElm = levelOrder(root);

//         // Perform level-order traversal and add elements to the ArrayList

//         // Print the level -order elements
//         System.out.println("Post-order elements: " + levelOrderElm);
//     }
// }
