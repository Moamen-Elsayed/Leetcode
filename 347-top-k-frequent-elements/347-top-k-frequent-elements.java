class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k)
            return nums;
        
        
        // step 1 create a map with a number with its freq
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        
        
        // step 2 create a heap with size k 
        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> freq.get(n1) - freq.get(n2)
        );
        
        
        // step 3 keep element with freq K or more
        for(int n : freq.keySet()){
            heap.add(n);
            if(heap.size() > k) heap.poll();
        }
        
        // step 4 poll the elements in heap into an array to return;
        int[] topK = new int[k];
        for(int i=k-1 ; i>=0 ; --i)
            topK[i] = heap.poll();
            
            
            
        return topK;
        
    }
}