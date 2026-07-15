class Solution {
    public int[] leftRightDifference(int[] nums) {

        int total = 0;
        int[] answer = new int[nums.length];
        for (int num : nums) {
            total += num;
        }
        int leftsum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightsum = total - leftsum - nums[i];
            answer[i] = Math.abs(leftsum - rightsum);  // abs returns the absolutes value
            leftsum += nums[i];
        }
        return answer;
    }
}