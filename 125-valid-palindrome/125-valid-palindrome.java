class Solution {
    public boolean isPalindrome(String s) {
        
        
        String S = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(S.length() == 1)
            return true;
        int a = 'a', z='z';
        int i=0 , j=S.length()-1;
        
        while(i <= j){
            if(S.charAt(i) == S.charAt(j)){
                    i++;
                    j--;
                }else
                    return false;
            }
       
        
        return true;
    }
}