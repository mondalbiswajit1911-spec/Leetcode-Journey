class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = (nums.length)/2;
        //int res = 0;

        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int num: nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (hashMap.get(num) == n) {
                return num;
            }
        }

        return -1;


        // int count = 0;
        // int res = 0;
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[j] == nums[i]){
        //             count++;
        //         }

        //     }
        //     if(count == n-1){
        //             res = nums[i];
        //         }
        // }
        //return res;
    }
}