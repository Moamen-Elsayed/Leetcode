class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0) return 0;
        if(needle.length() > haystack.length()) return -1;
        
        int nlen = needle.length();
        int hlen = haystack.length();
        for(int i=0 ; i<= (hlen - nlen) ; i++){
            int j = 0;
            while(j<nlen && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if(j == nlen)
                return i;
        }
        
        return -1;
            
    }
}