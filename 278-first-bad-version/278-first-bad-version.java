/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l < r){
            int version = l + (r - l) / 2;
            if(isBadVersion(version))
                r = version;
            else
                l = version + 1;
            
        }
        
        return l;
        
        
        
    }
}