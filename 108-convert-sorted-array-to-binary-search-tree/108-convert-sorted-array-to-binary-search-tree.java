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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return buildTree(nums, 0, nums.length-1);
        
    }
    
    public TreeNode buildTree(int[] nums, int start, int end){
        if(start > end)
            return null;
        
        int mid = (start + end) / 2;
        TreeNode bst = new TreeNode(nums[mid]);
        bst.right = buildTree(nums, mid+1, end);
        bst.left = buildTree(nums, start, mid-1);
        
        return bst;
    } 
    

}