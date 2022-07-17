class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        int nrows = ranges.length;        
        int k = left;
        int flag = 0;
        while(k <= right){
            for(int i=0 ; i<nrows ; i++){
                if(k >= ranges[i][0] && k <= ranges[i][1]) flag = 1;
            }
            
            if(flag == 0) return false;
            else k++;
            flag = 0;
        }
        
        return true;
    }
}