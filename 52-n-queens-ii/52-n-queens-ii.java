class Solution {
    
    int ans;
    
    public int totalNQueens(int n) {
        ans = 0;
        place(0,0,0,0,n);
        return ans;
    }
    
    private void place(int row, int col, int diag, int antidiag, int N){
        
        if(row == N) ans++;
        else{
            for(int j=0 ; j<N ; j++){
                int vmask = 1 << j, lmask = 1 << (row+j), rmask= 1 << (N-row-1+j);
                if((col&vmask) + (diag&lmask) + (antidiag&rmask) > 0)
                    continue;
                place(row+1, col | vmask , diag | lmask , antidiag | rmask, N);
            }
        }
    }
    
}