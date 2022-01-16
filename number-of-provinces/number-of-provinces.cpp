class Solution {
public:
    
    vector<int> root;
    
    void build(int n){
        for(int i=0 ; i<n ; i++)
            root.push_back(i);
    }
    
    int find(int x){
        if(root[x] == x)
            return x;
        return root[x] = find(root[x]);
    }
    
    void unionSet(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        
        if(rootX != rootY)
            root[rootY] = rootX;
        
        
        // if(rootX != rootY){
        //     for(int i=0 ; i<root.size() ; i++){
        //         if(root[i] == rootY)
        //             root[i] = rootX;
        //     }  
        // }    
    }
    
    
    int findCircleNum(vector<vector<int>>& isConnected) {
        
        int n = isConnected.size();
        build(n);
        
        for(int i=0 ; i<n ; i++)
            for(int j=0 ; j<n ; j++){
                if(isConnected[i][j] == 1 && i != j)
                    unionSet(i, j);
            }
        
        int province = 0;
        for(int i = 0; i < n; i++) {
            if(i == root[i])
                province++;
        }
        
        return province;
        
        
        
        
        
    }
};