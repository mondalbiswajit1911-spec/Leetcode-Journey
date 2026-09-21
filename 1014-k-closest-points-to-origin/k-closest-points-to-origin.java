class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a, b) -> b[0]-a[0]);

        for(int i =0;i<k;i++){
            int x = points[i][0],
            y = points[i][1];
            maxheap.add(new int[]{
                x*x + y*y,
                i
            });
        }

        for(int i = k;i<points.length;i++){
            int x = points[i][0],
            y = points[i][1];
            int currDis =  x*x + y*y;

            if(currDis < maxheap.peek()[0]){
                maxheap.remove();
                maxheap.add(new int[] {
                    currDis,
                    i
                });

            }
        }
        int [][] res = new int[k][2];
         int i = 0;
         while(i<k){
            int idx = maxheap.remove()[1];
            res[i] = points[idx];
            i++;
        }
        return res;
    }
}