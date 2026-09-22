class Solution {
    public int firstOccur(int[] nums, int target){
        int low =0,
        high = nums.length-1;

        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                ans = mid;
                high = mid -1;
            }else if(target > nums[mid]){
                low =mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;

    }

    public int lastOccur(int[] nums, int target){
        int low =0,
        high = nums.length-1;

        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }else if(target > nums[mid]){
                low =mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;

    }
    public int[] searchRange(int[] nums, int target) {
        int firstIndx = firstOccur(nums, target);
        if(firstIndx == -1){
            return new int[]{
                -1,
                -1
            };

        }
        int lastIndx  = lastOccur(nums, target);
        return new int[]{
            firstIndx,
            lastIndx
        };
        
    }
}