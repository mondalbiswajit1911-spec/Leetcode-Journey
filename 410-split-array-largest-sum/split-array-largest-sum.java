class Solution {
    public int countSplites(int[] nums,int val){
        int splits = 0;
        int subArrSum =0;
        for(int i = 0; i< nums.length;i++){
            subArrSum = subArrSum + nums[i];

            if(subArrSum > val){
                splits++;
                subArrSum = nums[i];
            }
        }
        return splits +1;

        }
    public int splitArray(int[] nums, int k) {
        int minval = Integer.MIN_VALUE;
        int maxval = 0;
        

        for(int num : nums ){
            minval = Math.max(minval, num);
            maxval = maxval + num;
        }
        int low = minval,
        high = maxval;
        while(low < high){
            int mid = low + (high - low)/2;
            int subArrCount = countSplites(nums, mid);

            if(subArrCount <= k){
                high = mid;
            }else{
                low= mid +1;
            }
        }
        return low;
    }
}