class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum = 0;
        for(int i = 0;i<nums.length;i++){
            totalsum = totalsum +nums[i];
        }

        int target = totalsum -x;
        if(target < 0){
            return -1;
        }
        if(target == 0){
            return nums.length;
        }

        int left =0;
        int sum =  0,
        maxlen = -1;

        for(int right =0;right<nums.length;right++){
            sum = sum +nums[right];
            while(sum > target){
                sum = sum - nums[left];
                left++;
            }
            if(sum == target){
                maxlen = Math.max(maxlen, right - left+1);
            }
        }
        if(maxlen == -1){
            return -1;
        }
        return nums.length - maxlen;
    }
}