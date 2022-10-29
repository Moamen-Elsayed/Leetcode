class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        int n = plantTime.length;
        List<Integer> idx = new ArrayList<>();
        for(int i=0 ; i<n ; i++)
            idx.add(i);
        
        Collections.sort(idx, Comparator.comparingInt(i -> -growTime[i]));
        int res = 0;
        for(int i=0, curPlantTime=0 ; i<n ; i++){
            int d = idx.get(i);
            int time = curPlantTime + plantTime[d] + growTime[d];
            res = Math.max(res, time);
            curPlantTime += plantTime[d];
        }
        
        return res;
    }
}