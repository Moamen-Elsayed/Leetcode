class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1 || numRows >= s.length()) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i=0  ; i<numRows ; i++)
            rows.add(new StringBuilder());
        int curRow = 0;
        boolean Down = false;
        
        for(char c : s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow==0 || curRow == numRows-1) Down = !Down;
            curRow += Down ? 1 : -1;
        }
        
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        
        
        return res.toString();
        
        
    }
}