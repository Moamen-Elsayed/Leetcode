class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] cntTop = new int[7], cntbottom = new int[7], cnt = new int[7];
        int len = bottoms.length;
        
        for(int i=0 ; i<len ; i++){
            if(tops[i] == bottoms[i])
                cnt[tops[i]]++;
            else{
                cnt[tops[i]]++;
                cnt[bottoms[i]]++;
                cntbottom[bottoms[i]]++;
                cntTop[tops[i]]++;
            }
        }
        
        for(int i=1 ; i<=6 ; i++){
            if(cnt[i] == len)
                return Math.min(cntbottom[i], cntTop[i]);
        }
        
        return -1;
    }
}