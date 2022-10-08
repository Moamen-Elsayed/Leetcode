class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0 ; i<nums.length ; i++){
            int l = i + 1, r=nums.length - 1;
            while(l < r){
                if(Math.abs(nums[i] + nums[l] + nums[r] - target) < Math.abs(diff)){
                    diff = nums[i] + nums[l] + nums[r] - target;
                }
                
                if(nums[i] + nums[l] + nums[r] > target)
                    r = r - 1;
                else if(nums[i] + nums[l] + nums[r] < target)
                    l = l + 1;
                else
                    return nums[i] + nums[l] + nums[r];
                
            }
 
        }
        
        return target + diff;
    }
}