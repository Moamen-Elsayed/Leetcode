class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2) return false;
        
        HashMap<Integer, Integer> remainder = new HashMap<>();
        remainder.put(0, -1);
        int Cum = 0;
        for(int j=0 ; j<nums.length ; j++){
            Cum += nums[j];
            int r = Cum % k;
            if(!remainder.containsKey(r)) remainder.put(r, j);
            else if(j - remainder.get(r) > 1) return true;
        }
        
        return false;
        
    }
        
}