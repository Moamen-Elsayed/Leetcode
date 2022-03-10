class Solution {
    public int divide(int dividend, int divisor) {
        long res = 0;
        long n1 = Math.abs((long)dividend), n2 = Math.abs((long)divisor);
        System.out.println(n1 + " " + n2);
        
        while(n1 >= n2){
            long tmp = n2 , cnt = 1;
            while(tmp <= n1){
                tmp <<= 1;
                cnt <<= 1;
            }
            res += cnt >> 1;
            n1 -= tmp >> 1; 
        }
        
        boolean NEG = (dividend>0 && divisor<0) || (dividend<0 && divisor>0) ? true : false;
        
         return NEG ? (int) ~res + 1 : res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;
    }
}