class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;

        List<int[]> res = new ArrayList<>();

        while(i< intervals.length && newInterval[0] > intervals[i][1]){
            res.add(intervals[i]);
            i++;
        }
        // intervals[i][0]- s1
        // intervals[i][1] - e1
        // newintervals[0] -s2
        // newintervals[1] - e2

        while(i < intervals.length && ( intervals[i][1] >=newInterval[0] &&  newInterval[1] >= intervals[i][0])){
            // update new intervals
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        while(i< intervals.length){
            res.add(intervals[i]);
            i++;
        }

        int[][] ans = new int[res.size()][2];
        for(int k =0;k< res.size();k++){
            ans[k] = res.get(k);
        }

        return ans;
    }
}