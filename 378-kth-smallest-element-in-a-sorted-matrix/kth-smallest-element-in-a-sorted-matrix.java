class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0]-b[0]);

        for(int i=0;i<matrix.length;i++){
            minHeap.add(new int[]{
                matrix[i][0],
                i,
                0
            });
        }
        int count = 1;
        while(!minHeap.isEmpty()){
            int[] ele = minHeap.poll();
            int val = ele[0],
            listId = ele[1],
            eleId = ele[2];
            if(count==k){
                return val;
            }
            count++;

            int nexteleId = eleId+1;
            if(nexteleId < matrix.length){
                minHeap.add(new int[]{
                    matrix[listId][nexteleId],
                    listId,
                    nexteleId
                });
            }
        }
        return -1;



        // List<Integer> list = new ArrayList<>();

        // for (int[] row : matrix) {
        //     //int row = matrix[i].length;
        //    for (int num : row) {
        //       list.add(num);
        //    }
        // }
        // // int res = 0;
        // // for (int i = 0; i < list.size(); i++) {
        // //    //System.out.println(list.get(i));
        // //    res = list.get(k-1);
        // // }
        // Collections.sort(list);
        // return list.get(k-1);
    }
}