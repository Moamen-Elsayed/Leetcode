class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        path = set()
        
        def Dfs(r, c, i):
            if i == len(word):
                return True
            
            if  r<0 or r>=len(board) or c<0 or c >=len(board[0]) or (r, c) in path or board[r][c]!=word[i]:
                    return False
                
            path.add((r, c))
            res = Dfs(r+1, c, i+1) or Dfs(r-1, c, i+1) or Dfs(r, c+1, i+1) or Dfs(r, c-1, i+1)   
            path.remove((r, c))
            
            return res
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                if Dfs(i, j, 0):
                    return True
        return False
    
    
    
        
        
        
        
       
        
        
            
        
        
        
    
    
        