class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }

        return sum - (nums.length * min);


        // int count=0;
        // Arrays.sort(nums);
        // for(int i = 0; i<nums.length-1;i++){
        //     if(nums[i]< nums[i+1]){
        //         nums[i] = nums[i]+1;
        //         count++;
        //     }
        // }
        // return count;
    }
}