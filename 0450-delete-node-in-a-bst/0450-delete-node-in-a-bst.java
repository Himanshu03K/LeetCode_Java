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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return root;
        if(root.val>key)
            root.left=deleteNode(root.left,key);
        else if(root.val<key)
            root.right=deleteNode(root.right,key);
        else{
            // Deletion code
            // 1 or 0 child
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            // 2 child
            else{
                int min = min(root.right);
                root.right = deleteNode(root.right,min);
                root.val=min;
            }
        }
        return root;
    }
    
    int min(TreeNode root){
        if( root == null)
            return Integer.MAX_VALUE;
        int left = min(root.left);
        return Math.min(left,root.val);
    }
}