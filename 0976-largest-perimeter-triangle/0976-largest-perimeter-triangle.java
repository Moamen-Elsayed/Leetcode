class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=nums.length-3 ; i>=0 ; i--){
            if(isTriangle(nums[i], nums[i+1], nums[i+2]) == true)
                return nums[i] + nums[i+1] + nums[i+2];
        } 
        return 0;  
    }
    
    public boolean isTriangle(int a, int b, int c){
        if(a+b>c && a+c>b && c+b>a) return true;
        return false;
    }
    
}