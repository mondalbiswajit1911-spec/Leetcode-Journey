class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rowdet = new int[mat.length][2];
        for(int i =0; i< mat.length;i++){
            rowdet[i][1] = i;
            int count = 0;

            int[] row = mat[i];

            for(int ele : row){
                if(ele == 0){
                    break;
                }
                count++;
            }
            rowdet[i][0] = count;
        }
        Arrays.sort(rowdet, (a, b) ->{
            if(a[0] == b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int[] res = new int[k];
        for(int i =0; i<k;i++){
            res[i] = rowdet[i][1];
        }
        return res;
    }
}