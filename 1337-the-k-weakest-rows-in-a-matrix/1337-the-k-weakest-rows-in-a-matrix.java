class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<int []> heap = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        int pos = 0;
        for(int[] row : mat){
            int l=0, r=row.length;
            while(l<r){
                int mid = l + (r - l) / 2;
                if(row[mid] != 0) 
                    l = mid+1;
                else
                    r = mid;
            }
            
            heap.offer(new int[]{r, pos++});
            if(heap.size() > k)
                heap.poll();
        }
        
        int[] out = new int[k];
        for(int i = k-1; i >=0; i--)  out[i] = heap.remove()[1];
            
            
        return out;
    }
}