class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        if(time.length == 1) return 0;
        // O(n^2)
//         int pairs = 0;
//         for(int i=0 ; i<time.length-1 ; i++)
//             for(int j=i+1 ; j<time.length ; j++){
//                 if((time[i] + time[j]) % 60 == 0)
//                     pairs++;
//             }
        
//         return pairs;
        
        // O(n)
        int pairs = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int t : time){
            int mod = t % 60;
            if(mp.containsKey(60 - mod))  pairs += mp.get(60 - mod);
            if(mod == 0) mp.put(60, mp.getOrDefault(60, 0)+1);
            else mp.put(mod, mp.getOrDefault(mod, 0)+1);           
        }
        
        return pairs;
        
        
        
    }
}