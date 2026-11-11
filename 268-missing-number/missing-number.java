class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIdx = nums[i];
        if(correctIdx >= nums.length){
            i++;
        }else if(nums[i] != nums[correctIdx]){
            int temp = nums[i];
            nums[i] = nums[correctIdx];
            nums[correctIdx] = temp; 
        }else{
            i++;
        }
        }
       for(int num = 0; num<nums.length;num++){
        if(num != nums[num]){
            return num;
        }
       }
       return nums.length;
    }
}