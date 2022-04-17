class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet <String> set = new HashSet();
        for(String email : emails){
            StringBuffer s = new StringBuffer(email);
            int i=0, j=0;
            while(s.charAt(j) != '@'){
                if(s.charAt(j) == '.')
                    s.replace(j, j+1, "");
                j++;
            }
            
            while(s.charAt(i) != '+' && i<j)
                i++;
            
            s.replace( i , j , "");
            
            System.out.println(s.toString());
            
            set.add(s.toString());
            
        }
        
        return set.size();
    }
}