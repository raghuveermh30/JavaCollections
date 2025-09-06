package leetcodeprbs;

import java.util.ArrayList;
import java.util.List;

//Problem: Given the root of a binary tree, return the inorder traversal of its nodes' values (left-root-right).
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list); // Recursive helper
        return list;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return; // Base case
        inorder(node.left, list); // Left
        list.add(node.val); // Root
        inorder(node.right, list); // Right
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();

        // Test case 1: Standard tree
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println(solution.inorderTraversal(root1)); // Expected: [1, 3, 2]

        // Test case 2: Empty tree
        System.out.println(solution.inorderTraversal(null)); // Expected: []

        // Test case 3: Single node
        TreeNode root3 = new TreeNode(5);
        System.out.println(solution.inorderTraversal(root3)); // Expected: [5]

        // Test case 4: Left skewed
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        System.out.println(solution.inorderTraversal(root4)); // Expected: [3, 2, 1]

        // Test case 5: Balanced
        TreeNode root5 = new TreeNode(2);
        root5.left = new TreeNode(1);
        root5.right = new TreeNode(3);
        System.out.println(solution.inorderTraversal(root5)); // Expected: [1, 2, 3]
    }

    /*Explanation: Recursive DFS: Traverse left subtree, add root, traverse right. Simple and follows inorder definition.

    Complexity: Time: O(n) (visit each node). Space: O(n) (recursion stack worst-case).*/
}
