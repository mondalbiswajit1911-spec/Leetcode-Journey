class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for(int num : nums){
            max = Math.max(num,max);
            min = Math.min(num, min);
        }

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i =min; i<= max; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}