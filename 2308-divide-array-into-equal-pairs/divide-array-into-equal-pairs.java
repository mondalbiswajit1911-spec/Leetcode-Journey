class Solution {
    public boolean divideArray(int[] nums) {
        int len = nums.length;
        int pairs = len/2;
        Arrays.sort(nums);
        // for(int i=0;i<len;i++){
        //     for(int j =i+1;j<pairs;j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        for(int i=0; i< len;i+=2){
            if(nums[i]!= nums[i+1]){
                return false;
            }
        }
        return true;
    }
}