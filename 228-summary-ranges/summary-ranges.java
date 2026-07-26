class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        //  Integer left = nums[i],
        // right = nums[i];

        List<String> res = new ArrayList<>();

        while (i < nums.length) {
            int left = nums[i];
            int right = left;

            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
                right = nums[i];
            }
            if(left == right) {
                res.add(String.valueOf(left));
            } else {
                res.add(left + "->" + right);
            }

            i++;
        }
        return res;
    }
}