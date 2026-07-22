class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count =0;

        for(int i=0; i < intervals.length; i++){

            int c = intervals[i][0],
            d = intervals[i][1];
            boolean isCoverd = false;

            for(int j = 0;j< intervals.length;j++ ){
                // i intervals cover
                int a = intervals[j][0];
                int b = intervals[j][1];

                if (i != j && (a <= c && b>=d)){
                    isCoverd = true;
                    break;
                }

            } 
            if(!isCoverd){
                count ++;
            }
        }
        return count;
    }
}