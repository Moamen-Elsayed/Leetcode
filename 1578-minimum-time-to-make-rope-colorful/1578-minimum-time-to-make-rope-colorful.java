class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        int Gcost = 0;
        List<Integer> lst;
        
        for(int i=0 ; i<colors.length() - 1 ; i++){
            lst = new ArrayList();
            int j = i;
            while(j<colors.length() - 1){
                if(colors.charAt(j) == colors.charAt(j+1)){
                    lst.add(neededTime[j]);
                    j++;  
                }else{
                    break;
                }
                  
            }
            
            if(j > i)
                lst.add(neededTime[j]);
            
            i = j;
            
            
            
            
            if(lst.size() > 0){
                Collections.sort(lst);
                int mx = lst.get(lst.size() - 1);
                int Lcost = 0;
                for(int ele : lst)
                    Lcost += ele;
                Gcost += Lcost - mx; 
                
                
            }
            
        }
        
        return Gcost;
    }
}