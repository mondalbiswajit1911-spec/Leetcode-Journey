class Solution {
    public int lengthOfLIS(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = 1;
        }
        int ans =0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<i;j++){
                if(nums[i]>nums[j]){
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }
}