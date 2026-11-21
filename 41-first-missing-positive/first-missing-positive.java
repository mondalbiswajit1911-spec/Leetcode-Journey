class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i = 1;i<=(nums.length+1);
        i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
        
        // int i =0;
        // while(i<nums.length){
        //     int currectIdx = nums[i]-1;
        //     if(nums[currectIdx] != nums[i] ){
        //         int temp = nums[currectIdx];
        //         nums[currectIdx] = nums[i];
        //         nums[i] = temp;
        //     }else{
        //         i++;
        //     }
        // }
        // int misnum = 0;
        // for(int j = 0; j<nums.length;j++){
        //     if(nums[j] == j+1){
        //         misnum = j+1;
        //     }
        // }
        // return nums[misnum];
    }
}