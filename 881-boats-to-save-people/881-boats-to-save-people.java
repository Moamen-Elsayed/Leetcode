class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int i=0 , j=people.length-1, cnt=0;
        while(i<j){
            if(people[i]+people[j] > limit){
                cnt++;
                j--;
            }else if(people[i]+people[j] <= limit){
                cnt++;
                i++;
                j--;
            }
            
            if(i == j){
                cnt ++;
                break;
            }
        }
        
        return cnt;
    }
}