class Solution {
    public int mySqrt(int x) {
       int res = 0;
       for(int i = 0;i <= x ;i++){
        long val = (long)i * i;
        if(val > x ){
            break;
        }
        res = i;
       }
       return res;
    }
}