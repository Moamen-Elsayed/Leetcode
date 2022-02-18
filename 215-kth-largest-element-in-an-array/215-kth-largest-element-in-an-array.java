class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Queue<Integer> MinHeap = new PriorityQueue<>(
            (n1, n2) -> n1 - n2
        );
        
        for(int i : nums){
            MinHeap.add(i);
            if(MinHeap.size() > k) MinHeap.poll();
        }
        
        return MinHeap.poll();
    }
}