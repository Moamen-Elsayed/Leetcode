class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int[] end = new int[26];
        int pos;
        
        for(int i=0 ; i<s.length() ; i++){
            pos = s.charAt(i) - 'a';
            end[pos] = i;
        }
        
        int j=0 , anc=0;
        List<Integer> ans = new ArrayList();
        for(int i=0 ; i<s.length() ; i++){
            pos = s.charAt(i) - 'a';
            j = Math.max(j, end[pos]);
            if(i == j){
                ans.add(i - anc + 1);
                anc = i + 1;
            }
        }
        
        return ans;
    }
}