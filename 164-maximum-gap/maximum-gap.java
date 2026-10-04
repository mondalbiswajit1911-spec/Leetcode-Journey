class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int diff = 0;
        int max =0;
        for(int i = 0;i<nums.length-1;i++){
            diff = nums[i+1]- nums[i];
            max = Math.max(max, diff);
        }
        return max;
    }
}