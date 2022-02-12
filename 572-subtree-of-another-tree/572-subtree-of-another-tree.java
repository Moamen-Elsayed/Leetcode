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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(subRoot == null)
            return true;
        if(root == null)
            return false;
        
        if(isSame(root, subRoot))
            return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    
    
    boolean isSame(TreeNode root, TreeNode sub){
        if(root == null && sub == null)
            return true;
        if(root != null && sub != null && root.val == sub.val)
            return isSame(root.left, sub.left) && isSame(root.right, sub.right);
        return false;
    }
}