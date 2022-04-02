class Solution {
    public boolean check(String s, int i, int j){
         while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
    public boolean validPalindrome(String s) {
        
        if(s == null)
            return true;
        
        int i=0 , j=s.length()-1, cnt=0;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
                return check(s, i+1, j) || check(s, i, j-1);
                
            i++;
            j--;
            
                
        }
        
        return true;
        
        
    }
}