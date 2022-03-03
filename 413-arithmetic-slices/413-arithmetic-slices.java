class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length < 3)
            return 0;
        
        int diff = nums[1] - nums[0];
        int res = 0;
        int cnt = 1;
        for(int i=1 ; i<nums.length-1 ; i++){
            if(nums[i+1]-nums[i] != diff){
                cnt = 1;
                diff = nums[i+1]-nums[i];
            }else if(nums[i+1]-nums[i] == diff){
                cnt++;
                if(cnt>=2){
                    res += cnt - 1;
                }     
            }         
        }
        return res;
    }
}