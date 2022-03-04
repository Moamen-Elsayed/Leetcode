class Solution {
public:
    
    int BSearch(vector<int>& nums, int target, bool firstOccurence){
        int res = -1;
        int l = 0;
        int r = nums.size() - 1;
        
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                res = mid;
                if(firstOccurence)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            
            else if(nums[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        
        return res;
    }
    
    
    
    vector<int> searchRange(vector<int>& nums, int target) {  
        return {BSearch(nums,target,true),BSearch(nums,target,false)};
    }
};