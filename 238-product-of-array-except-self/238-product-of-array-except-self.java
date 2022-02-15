class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int [nums.length+1];
        int[] post = new int [nums.length+1];
        
        pre[0] = 1;
        post[nums.length] = 1;
            
        for(int i=0 ; i<nums.length ; i++){
            pre[i+1] = pre[i] * nums[i];
        }
        
        for(int i=nums.length-1 ; i>=0 ; i--){
            post[i] = post[i+1] * nums[i];
        }
        
        int[] res = new int [nums.length];
        for(int i=0 ; i<nums.length ; i++){
            res[i] = pre[i] * post[i+1];
        }
        
        
        return res;
    }
}