class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0 ; i<matrix.length ; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[0].length-1]){
                int l=0, h=matrix[0].length, mid;
                while(l <= h){
                    mid = l + (h - l) / 2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] > target)
                        h = mid-1;
                    else
                        l = mid+1;
                }
            }
        }
        
        return false;
    }
}