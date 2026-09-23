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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
        
    }
    public boolean dfs(TreeNode root, int curSum, int tarSum) {
        if (root == null) return false;

        curSum += root.val;
        if (root.left == null && root.right == null) {
            return curSum == tarSum;
        }
        return dfs(root.left, curSum, tarSum) || dfs(root.right, curSum, tarSum);
    }
}