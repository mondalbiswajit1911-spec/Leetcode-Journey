class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int currectIdx = nums[i]-1;
            if(nums[currectIdx] != nums[i]){
                int temp = nums[currectIdx];
                nums[currectIdx] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(int j = 0; j< nums.length;j++){
            if(nums[j] != j+1){
                int misNum = j+1;
                int dup = nums[j];
                return new int[]{
                    dup, misNum
                };
            }
            
        }
        return new int[]{
                -1, -1
            };
    }
}