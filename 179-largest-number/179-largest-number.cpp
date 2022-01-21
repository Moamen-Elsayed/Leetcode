class Solution {
public:
    static bool Compare(string a, string b){
        return a+b > b+a;
    }
    
    string largestNumber(vector<int>& nums) {
        string res;
        vector<string>str;
        for(int num : nums){
            str.push_back(to_string(num));
        }
        
        sort(str.begin(), str.end(), Compare);
        for(string num : str){
            res += num;
        }
        
        int pos = 0;
        while (res[pos] == '0' && pos + 1 < res.size()) pos++; 
        return res.substr(pos);
        
        

        
    }
};