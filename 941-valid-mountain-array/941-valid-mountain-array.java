class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length < 3)
            return false;
        
        boolean flag = false;
        for(int i = 1 ; i<arr.length-1 ; i++){
            if(arr[i] == arr[i-1] || arr[i] == arr[i+1])
                return false;
            else if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
                flag = true;  
            else if(arr[i] < arr[i-1] && arr[i] < arr[i+1])
                return false;
        }
        
        return true ? flag : false;
    }
}