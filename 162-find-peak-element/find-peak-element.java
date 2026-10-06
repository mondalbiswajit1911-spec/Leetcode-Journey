class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0,
        high = nums.length-1;

        while(low < high){
            int mid = low + (high - low)/2;

            if(nums[mid] < nums[mid +1]){
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return high;
        
        
        
        // for(int i =1;i<nums.length;i++){
        //     if(nums[i]>nums[i-1]){
        //         if(nums[i]>nums[i+1]){
        //             return i;
        //         }
        //     }
        // }
        // if(nums.length == 1){
        //     return 0;
        // }
        // return -1;
    }
}