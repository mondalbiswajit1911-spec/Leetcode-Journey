class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();

        for (int[] row : matrix) {
            //int row = matrix[i].length;
           for (int num : row) {
              list.add(num);
           }
        }
        // int res = 0;
        // for (int i = 0; i < list.size(); i++) {
        //    //System.out.println(list.get(i));
        //    res = list.get(k-1);
        // }
        Collections.sort(list);
        return list.get(k-1);
    }
}