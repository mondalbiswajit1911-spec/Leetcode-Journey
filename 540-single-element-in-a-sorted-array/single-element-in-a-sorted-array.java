class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0,
        high = nums.length-1;
        while(low < high){
            int mid = low + (high - low)/2;
            int leftele = mid-low+1,
            rightele = high-mid+1;
            if(nums[mid] == nums[mid +1]){
                if(rightele %2 == 1){
                    low = mid + 2;
                }else{
                    high = mid -1;
                }
            }
            else if(nums[mid] == nums[mid-1]){
                if(leftele % 2 == 1){
                    high = mid -2;
                }else{
                    low = mid +1;
                }
            }
            else{
                return nums[mid];
            }
        }
        return nums[low];
    }
}