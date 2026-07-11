class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        //int num;
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}