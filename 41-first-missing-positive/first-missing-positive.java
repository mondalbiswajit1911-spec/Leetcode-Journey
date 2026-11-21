class Solution {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length){
            int currectIdx = nums[i]-1;
            if(currectIdx < 0 || currectIdx >= nums.length){
                i++;
            }
            else if(nums[currectIdx] != nums[i] ){
                int temp = nums[currectIdx];
                nums[currectIdx] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for( i= 0; i<nums.length;i++){
            if(nums[i] != i+1){
                return  i+1;
            }
        }
       return i + 1;


        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // for(int i = 1;i<=(nums.length+1);
        // i++){
        //     if(!set.contains(i)){
        //         return i;
        //     }
        // }
        // return -1;

        
    }
}