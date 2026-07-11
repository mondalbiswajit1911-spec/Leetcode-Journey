class Solution {
    public int singleNumber(int[] nums) {
         //Set<Integer> set = new HashSet<>();
         int s_value = 0;
        for (int num : nums) {
           s_value = s_value^num; // Duplicate numbers will naturally cancel each other out to 0
        }

        return s_value; 
    }
}