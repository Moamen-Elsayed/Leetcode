class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> St = new ArrayList<>();
        for(int stone : stones)
            St.add(stone);
        while(St.size() > 1){
            Collections.sort(St);
            Collections.reverse(St);
            St.add(Math.abs(St.get(0) - St.get(1)));
            St.remove(0);
            St.remove(0);
            
        }
        
        return St.get(0);
    }
}