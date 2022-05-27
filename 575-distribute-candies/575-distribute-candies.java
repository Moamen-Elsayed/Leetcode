class Solution {
    public int distributeCandies(int[] candyType) {
        
        int should_eat = candyType.length  / 2;
        Set<Integer> unique = new HashSet<Integer>();
        for(int type : candyType)
            unique.add(type);
        
        return unique.size() > should_eat ? should_eat : unique.size();
        
    }
}