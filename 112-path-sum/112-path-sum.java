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
    public boolean hasPathSum(TreeNode root, int targetsum) {
        if(root == null) return false;
    
        if(root.left == null && root.right == null && targetsum - root.val == 0) return true;
    
        return hasPathSum(root.left, targetsum - root.val) || hasPathSum(root.right,targetsum - root.val);
    }
}