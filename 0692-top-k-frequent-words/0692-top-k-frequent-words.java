class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> out = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(
            (a, b)->{
                if(a.getValue() != b.getValue())
                    return a.getValue().compareTo(b.getValue());
                return -a.getKey().compareTo(b.getKey());
            }
        );
        
        for(String word : words)
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        
        
        for(Map.Entry<String,Integer> entry : mp.entrySet()){
            heap.offer(entry);
            if(heap.size() > k)
                heap.poll();
        }
        
        while(heap.size() > 0)
            out.add(heap.poll().getKey());
        
        Collections.reverse(out);
        return out;
    }
}