class Solution {
    public boolean isPossible(long x, int n, int[] batteries){
        long bsum = 0;
        long csum = x *n;
        for(int i =0; i<batteries.length;i++ ){
            bsum = bsum + Math.min(batteries[i], x);
            if(bsum >= csum){
                return true;
            }
        }
        return false;
    }

    public long maxRunTime(int n, int[] batteries) {
        int min = Integer.MAX_VALUE;
        long max = 0;

        for(int num : batteries ){
            min = Math.min(min, num);
            max = max + num;
        }
        long low = min;
        long high = max / n;
        //long ans = low;

        while(low < high){
             long mid = low + (high -low)/2;
            if(isPossible(mid, n, batteries)){
                low = mid +1;
            }else{
                high = mid;
            }
            
        }
        return isPossible(low, n, batteries) ? low : low -1;


        // int sum = 0;
        // for(int num : batteries){
        //     sum += num;
        // }
        // int ans = 0;
        // for(int i = 0;i<100;i++){
        //     if(i*n <= sum){
        //         ans = i;
        //     }
        // }
        // return ans;
    }
}