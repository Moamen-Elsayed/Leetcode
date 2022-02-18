class Solution {
    public int maxSubArray(int[] nums) {
        int curMax = 0;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(curMax < 0){
                curMax = 0;
            }
            curMax += num;
            max = Math.max(curMax, max);     
        }
        
        return max;
    }
}


