class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
         int max = nums[nums.length-1];
         int count = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != max){
                count = count + (max - nums[i]);
            }
        }
        return count;
        
    }
}