class Solution {
    
    private List<List<String>> result;
    private int N;

    
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        N = n;
        char[][] emptyboard = new char[N][N];
        
        for (char[] row: emptyboard) Arrays.fill(row, '.');
        
        backtracking(emptyboard, 0, 0, 0, 0);
        return result;
    }
    
    private void backtracking(char[][] board, int row, int cols, int diags, int antiDiags){
        // put the queen successfully
        if(row == N){
            List<String> newBoard = new ArrayList<>();
            for(char[] r : board)
                newBoard.add(new String(r));
            result.add(newBoard);
            return;
        }
        
        for(int col=0; col<N; col++){
            int currDiag = row-col+N;
            int currAntiDiag = col+row;
            
            // check if current palce is valid
            if((cols & (1 << col)) != 0 || (diags & (1 << currDiag)) != 0 || (antiDiags & (1 << currAntiDiag)) != 0)
                continue;
            //  if so
            board[row][col] = 'Q';
            cols |= (1 << col);
            diags |=  (1 << currDiag);
            antiDiags |= (1 << currAntiDiag);
            
            backtracking(board, row+1, cols, diags, antiDiags);
            
            // undo changes and continue
            board[row][col] = '.';
            cols ^= (1 << col);
            diags ^= (1 << currDiag);
            antiDiags ^= (1 << currAntiDiag);
            
            
        }
    }
}