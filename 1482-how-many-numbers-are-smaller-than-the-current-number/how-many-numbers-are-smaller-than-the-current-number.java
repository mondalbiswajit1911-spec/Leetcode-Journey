class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //int count = 0;
        int[] arr = new int[nums.length];
        //Arrays.sort(nums, Collections.reverseOrder());

        for(int i = 0; i < nums.length;i++){
            int count = 0;
            for(int j = 0; j< nums.length;j++){
                if(nums[i]> nums[j]){
                    count++;
                }

            }
            // for(int k = 0; k<arr.length;k++){
            //      arr[k] = count;
            // }
            arr[i]= count;
            //count = 0;
        }
        return arr;
    }
}