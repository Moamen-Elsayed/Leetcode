class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int[][] matrix_ = new int[matrix.length][matrix[0].length];
        int flag = 0;
        for(int i=0 ; i<matrix.length ; i++)
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j] == '1') flag = 1;
                matrix_[i][j] = Character.getNumericValue(matrix[i][j]);
            }
          
        int result = 0;
        for(int i=1 ; i<matrix.length ; i++)
            for(int j=1 ; j<matrix[i].length ; j++){
                if(matrix_[i][j] >= 1){
                    matrix_[i][j] = 1 + Math.min(matrix_[i][j-1], Math.min(matrix_[i-1][j], matrix_[i-1][j-1]));
                }
                result = Math.max(result, matrix_[i][j]);
            }

        return ((flag == 1) && (result == 0) ) ? 1 : result * result;  
    }
}