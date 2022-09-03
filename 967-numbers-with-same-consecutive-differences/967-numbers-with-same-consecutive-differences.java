class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        if(n == 1)
            return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> results = new ArrayList<>();
        for(int num=1 ; num<10 ; ++num)
            this.DFS(n-1, num, k, results);
        return results.stream().mapToInt(i->i).toArray();
    }
    
    public void DFS(int n, int num, int k, List<Integer> results){
        if(n == 0){
            results.add(num);
            return;
        }
        
        List<Integer> nextDigits = new ArrayList<>();
        int tailDigit = num % 10;
        nextDigits.add(tailDigit + k);
        if(k != 0)
            nextDigits.add(tailDigit - k);
        for(int nextDigit : nextDigits){
            if(0 <= nextDigit && nextDigit < 10){
                int newNum = num * 10 + nextDigit;
                this.DFS(n-1, newNum, k, results);
            }  
        }       
    }
}