class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
           return new int[][]{newInterval};
        }
        List<int[]> list = new ArrayList<>();

        list.add(intervals[0]);
        boolean flag = false;
         if(newInterval[0] <= list.get(0)[1] && newInterval[1] >= list.get(0)[0]){
            list.get(0)[0]= Math.min(newInterval[0],list.get(0)[0]);
            list.get(0)[1] = Math.max(newInterval[1],list.get(0)[1]);
            flag = true;
         }
         if(intervals.length == 1 && !flag){
            list.add(newInterval);
         }

         for(int i=1; i<intervals.length; i++){
            int curr[] = intervals[i];
            if(flag){
                if(curr[0]<=list.get(list.size()-1)[1] && curr[1]>=list.get(list.size()-1)[0]){
                    list.get(list.size()-1)[0] = Math.min(curr[0], list.get(list.size()-1)[0]);
                    list.get(list.size()-1)[1] = Math.max(curr[1], list.get(list.size()-1)[1]);
                }
                else{
                    list.add(curr);
                }
            }
            else{
                if(newInterval[0]<= curr[1] && newInterval[1] >= curr[0]){
                    list.add(new int[]{
                        Math.min(curr[0], newInterval[0]),
                        Math.max(curr[1], newInterval[1])
                    });
                    flag = true;
                }else{
                    list.add(curr);
                }
            }
         }
         if(!flag && intervals.length!=1){
            list.add(newInterval);
         }
         Collections.sort(list,(a,b)->a[0]-b[0]);
         return list.toArray(new int[list.size()][]);
    }
}