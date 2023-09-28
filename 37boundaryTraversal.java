package striver.Treee;
// import java.util.*;
import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        right = null;
        left = null;
    }
}
public class boundarytraversal {
    public static Boolean isLeaf(TreeNode root) {
        return (root.left == null) && (root.right == null);
    }

    public static void leftBoundary(TreeNode root , ArrayList<Integer> res){
        TreeNode curr = root.left;
        while(curr != null){
            if(isLeaf(root) == false) res.add(curr.data);
            if(curr.left != null) res.add(curr.data);
            else curr= curr.right;
        }

    }
    public static void rightBoundary(TreeNode root , ArrayList<Integer> res){
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>(0);
        while(curr != null){
            if(isLeaf(root) == false) temp.add(curr.data);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        
        for(int i = temp.size()-1; i >= 0;i--){
            res.add(temp.get(i));

        }
    }
    public static void addLeaves(TreeNode root ,ArrayList<Integer> res){
        if(isLeaf(root) ){
            res.add(root.data);
            return;
        }
        if(root.left != null) addLeaves(root.left, res);
        if(root.right != null) addLeaves(root.right, res);
    }
    public static ArrayList<Integer> printBoundary(TreeNode node){
        ArrayList<Integer> ans = new ArrayList<>();
        if(isLeaf(node) == false) ans.add(node.data);
        leftBoundary(node, ans);
        addLeaves(node, ans);
        rightBoundary(node, ans);
        return ans;
    }
    public static void main(String[]args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);


        ArrayList<Integer> ans = printBoundary(root);
        for(int i = 0 ; i < ans.size()-1;i++){
            System.out.println(ans.get(i) + " ");
        }

    }
    
}


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

// public class boundarytraversal {
//     public static Boolean isLeaf(TreeNode node) {
//         return (node.left == null) && (node.right == null);
//     }

//     public static void leftBoundary(TreeNode root, ArrayList<Integer> res) {
//         TreeNode curr = root;
//         while (curr != null) {
//             if (!isLeaf(curr))
//                 res.add(curr.data);
//             if (curr.left != null)
//                 curr = curr.left;
//             else
//                 curr = curr.right;
//         }
//     }

//     public static void rightBoundary(TreeNode root, ArrayList<Integer> res) {
//         TreeNode curr = root;
//         ArrayList<Integer> temp = new ArrayList<>(0);
//         while (curr != null) {
//             if (!isLeaf(curr))
//                 temp.add(curr.data);
//             if (curr.right != null)
//                 curr = curr.right;
//             else
//                 curr = curr.left;
//         }

//         for (int i = temp.size() - 1; i >= 0; i--) {
//             res.add(temp.get(i));
//         }
//     }

//     public static void addLeaves(TreeNode root, ArrayList<Integer> res) {
//         if (isLeaf(root)) {
//             res.add(root.data);
//             return;
//         }
//         if (root.left != null)
//             addLeaves(root.left, res);
//         if (root.right != null)
//             addLeaves(root.right, res);
//     }

//     public static ArrayList<Integer> printBoundary(TreeNode node) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         if (!isLeaf(node))
//             ans.add(node.data);
//         leftBoundary(node.left, ans);
//         addLeaves(node, ans);
//         rightBoundary(node.right, ans);
//         return ans;
//     }

//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.right.left = new TreeNode(5);
//         root.right.right = new TreeNode(6);

//         ArrayList<Integer> ans = printBoundary(root);
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//     }
// }
