class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int[] res = {-1,-1};
        if(nums == null || nums.length == 0)
            return res;
        
        
        int i=0 , j=nums.length-1, mid=i + (j - i) / 2;
        while(i<=j){
            mid = i + (j - i) / 2;
            if(nums[mid] == target) break;
            else if(nums[mid] < target) i = mid+1;
            else j = mid-1;
        }
        
        System.out.print(nums[mid]);
        
        if(nums[mid] != target){
            return res;
        }
            
        i = mid; j=mid;
        while(j<nums.length && nums[j] == target)
            j++;
        while(i>=0 && nums[i] == target)
            i--;
        
        res[0] = i+1;
        res[1] = j-1;
        return res;
        
    }
}