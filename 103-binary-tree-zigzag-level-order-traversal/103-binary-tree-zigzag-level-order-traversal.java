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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> lvls = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)
            return lvls;
        
        q.add(root);
        int lvlnm = -1;
        while(!q.isEmpty()){
            lvlnm++;
            int lvlsize = q.size();
            List<Integer> lvl = new ArrayList<>();
            if(lvlnm%2 == 0){
                for(int i=0 ; i<lvlsize ; i++){
                    TreeNode tmp = q.poll();
                    lvl.add(tmp.val);
                    
                    if(tmp.left != null)
                        q.add(tmp.left);
                    if(tmp.right != null)
                        q.add(tmp.right);
                }
            }else{
                for(int i=0 ; i<lvlsize ; i++){
                    TreeNode tmp = q.poll();
                    lvl.add(0,tmp.val);
                    
                    if(tmp.left != null)
                        q.add(tmp.left);
                    if(tmp.right != null)
                        q.add(tmp.right);
                }    
            }
            lvls.add(lvl);
        }
        
        return lvls;
    }
}