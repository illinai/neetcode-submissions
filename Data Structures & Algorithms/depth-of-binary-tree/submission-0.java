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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 0);
    }
    public int dfs(TreeNode root, int depth) {
        if (root != null) depth++;
        if(root == null) return depth+0;
        
        if(root.left != null && root.right != null) {
            return Math.max(dfs(root.left, depth), dfs(root.right, depth));
        }
        if (root.left == null) {
            return dfs(root.right, depth);
        } else {
            return dfs(root.left, depth);
        }
    }
}
