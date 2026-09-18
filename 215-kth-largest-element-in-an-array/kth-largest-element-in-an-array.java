class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        // int res = 0;
        // for(int i =0;i<len;i++){
        //     res = nums[len-k];
        // }
        // return res;
        return nums[len-k];
    }
}