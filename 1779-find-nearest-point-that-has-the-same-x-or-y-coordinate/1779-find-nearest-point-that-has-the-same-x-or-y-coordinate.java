class Solution {
    int x, y;
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        this.x=x;
        this.y=y;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> mannDist(points[a]) - mannDist(points[b]));
        
        for (int i = 0 ; i < points.length ; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                pq.add(i);
            }
        }
        
        return (pq.size() == 0) ? -1 : pq.poll();
        
    }
    
    private int mannDist(int[] point) {
        return Math.abs(this.x - point[0]) + Math.abs(this.y - point[1]);
    }
}