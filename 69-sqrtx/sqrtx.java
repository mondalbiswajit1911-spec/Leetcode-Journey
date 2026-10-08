class Solution {
    public int mySqrt(int x) {
        int res = 0;
        int low = 1,
        high = x;
        while(low <= high){
            int mid = low + (high-low)/2;
            long val = (long) mid * mid;
            if(val > x){
                high = mid-1;
            }else{
                res = mid;
                low = mid+1;
            }
        }
        return res;

      
    //    for(int i = 0;i <= x ;i++){
    //     long val = (long)i * i;
    //     if(val > x ){
    //         high = mid-1;
    //         break;
    //     }
    //     res = i;
    //    }
    //    return res;
    }
}