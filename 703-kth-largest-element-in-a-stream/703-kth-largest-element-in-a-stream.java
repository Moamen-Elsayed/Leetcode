class KthLargest {

   PriorityQueue<Integer> q;
    private int th;
    
    public KthLargest(int k, int[] nums) {
        this.th = k;
        q = new PriorityQueue<>(th);
        for(int i=0 ; i<nums.length ; i++)
            add(nums[i]);
    }
    
    public int add(int val) {
        if(q.size() < th)
            q.offer(val);
        else if(q.peek() < val){
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */