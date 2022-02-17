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
    int goodnodes;
    public int goodNodes(TreeNode root) {
        
        goodnodes=0;
        good(root, Integer.MIN_VALUE);
        return goodnodes;
        
        
    }
    
    void good(TreeNode root, int max){
        if(root == null)
            return;
        
        if(root.val >= max)
            goodnodes++;
        
        max = Math.max(root.val, max);
        
        good(root.left, max);
        good(root.right, max);
        
        
        
    }
}