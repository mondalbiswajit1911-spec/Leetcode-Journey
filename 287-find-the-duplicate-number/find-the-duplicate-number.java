class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int currectIdx = nums[i]-1;
            if(nums[i] != nums[currectIdx]){
                int temp = nums[currectIdx];
                nums[currectIdx] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        int dup = 0;
        for(int j = 0; j<nums.length;j++){
            if(nums[j] != j+1){
                dup = nums[j];
            }
        }
        return dup;
    }
}