class Solution {
    public String getSmallestString(int n, int k) {
        
        int z = (k - n - 1)  / 25;
        int midChar = (k - n - 1) % 25;
        int a = n - z - 1;
        
        return "a".repeat(a) + (char)('a' + midChar + 1) + "z".repeat(z);
        
    }
}