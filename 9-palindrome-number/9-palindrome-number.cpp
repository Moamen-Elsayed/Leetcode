class Solution {
public:
    bool isPalindrome(int x) {
        int rev = 0;
        int z = x;
        if(z < 0)
            return false;
        while(z != 0){
            int y = z % 10;
            z = z / 10;
            if(rev > INT_MAX/10 || (rev == INT_MAX/10 && y > 7)) return 0;            
            rev = rev * 10 + y;
        }
        
        if(rev == x)
            return true;
        else 
            return false;
    }
};