class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {
        backtrack(arr, "", 0);
        return max;
    }
    
    private void backtrack(List<String> arr, String current, int start){
        if(max < current.length())
            max = current.length();
        for(int i=start ; i<arr.size() ; i++){
            if(!isValid(current, arr.get(i))) continue;
            backtrack(arr, current+arr.get(i), i+1);
        }
    }
    
    
    
    private boolean isValid(String current, String newstr){
        int[] cnt = new int[26];
        for(int i=0 ; i<newstr.length() ; i++){
            if(++cnt[newstr.charAt(i) - 'a'] == 2) return false;
            if(current.contains(newstr.charAt(i)+"")) return false;
        }
        return true;
    }
}

