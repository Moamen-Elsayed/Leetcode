class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] files = path.split("/+");
        StringBuilder sb = new StringBuilder();
        for(String file : files){
            if(file.equals("..")) {
                if(!st.isEmpty()) st.pop();
            }
            else if(!file.equals(".") && !file.equals("")) st.push(file);
        }
        
        // for(String file : files)
        //     System.out.println("/"+file);
        
        
        while(!st.isEmpty()){
            sb.insert(0, "/"+st.pop());
        }
        
        return sb.length()==0 ? "/" : sb.toString() ;
    }
}