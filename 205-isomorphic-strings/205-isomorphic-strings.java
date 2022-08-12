class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] mappingtoT = new int[256];
        Arrays.fill(mappingtoT, -1);
        
        int[] mappingtoS = new int[256];
        Arrays.fill(mappingtoS, -1);
        
        for(int i=0 ; i<s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            if(mappingtoT[c1] == -1 && mappingtoS[c2] == -1){
                mappingtoT[c1] = c2;
                mappingtoS[c2] = c1;
            }
            
            else if(mappingtoT[c1] != c2 || mappingtoS[c2] != c1)
                 return false;
        }
        
        return true;
        
    }
}