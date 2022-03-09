class Solution {
    public int majorityElement(int[] nums) {
        int threshold = nums.length / 2;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        
        for(int num : nums){
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }
        
        for(int key : cnt.keySet()){
            
            if(cnt.get(key) > threshold)
                return key;
        }
        
        return 0;
        
        
    }
}