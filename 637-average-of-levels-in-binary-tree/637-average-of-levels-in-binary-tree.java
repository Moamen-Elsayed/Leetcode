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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            double sum = 0;
            int qsize = q.size();
            for(int i=0 ; i<qsize ; i++){
                TreeNode tmp = q.poll();
                sum += tmp.val;
                
                
                if(tmp.right != null)
                    q.add(tmp.right);
                if(tmp.left != null)
                    q.add(tmp.left);
            }
            
            avg.add(sum/qsize);
        }
        
        return avg;
        
    }
}