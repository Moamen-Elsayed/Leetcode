class Solution {
    public int splitArray(int[] nums, int m) {
        int sum = 0;
        int maxEle = Integer.MIN_VALUE;
        for(int num : nums){
            sum += num;
            maxEle = Math.max(maxEle, num);
        }
        
        int l = maxEle, r = sum, minSplitSum = 0;
        while(l <= r){
            int maxSumAllowed = l + (r - l) / 2;
            if(minSubarraysRequired(nums, maxSumAllowed) <= m){
                r = maxSumAllowed - 1;
                minSplitSum = maxSumAllowed;
            }else
                l = maxSumAllowed + 1;
        }
        
        return minSplitSum;
        
    }
    
    public int minSubarraysRequired(int[] nums, int m){
        int currentSum = 0;
        int splitsRequired = 0;
        
        for(int num : nums){
            if(currentSum + num <= m)
                currentSum += num;
            else{
                currentSum = num;
                splitsRequired++;
            }
        }
        
        return splitsRequired + 1;
     
    }
}




/*

[7, 2, 5] [10, 8]

[10, 2, 5] [8, 7]

*/