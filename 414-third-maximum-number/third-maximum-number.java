class MaxNumber {
    int num;
    boolean isAssigned;

    public MaxNumber(int n, boolean i) {
        num = n;
        isAssigned = i;
    }
}

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        MaxNumber max1 = new MaxNumber(nums[nums.length - 1], true);
        MaxNumber max2 = new MaxNumber(0, false);
        MaxNumber max3 = new MaxNumber(0, false);

        for (int k = nums.length - 2; k >= 0; k--) {

            if (nums[k] == max1.num) {
                continue;
            }

            if (!max2.isAssigned) {
                max2.num = nums[k];
                max2.isAssigned = true;
                continue;
            }

            if (nums[k] == max2.num) {
                continue;
            }

            if (!max3.isAssigned) {
                max3.num = nums[k];
                max3.isAssigned = true;
                break;
            }
        }

        return max3.isAssigned ? max3.num : max1.num;
    }
}