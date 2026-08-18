class Solution {
    public int missingNumber(int[] nums) {
        // int max = nums[0];
        // int min = nums[0];

        // for(int num : nums){
        //     max = Math.max(max, num);
        //     min = Math.min(min, num);
        // }

        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }

        // //List<Integer> missing = new ArrayList<>();
        // int missing_val =0;
        // for (int i = min; i <= max; i++) {
        //   if (!set.contains(i)) {
        //     missing_val = i;
        //     break;
        //     }
        // }
        // return missing_val;
         Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        //List<Integer> missing = new ArrayList<>();
        //int missing_val =0;
        for (int i = 0; i <= nums.length; i++) {
          if (!set.contains(i)) {
            return i;
            }
        }
        return -1;

    }
}