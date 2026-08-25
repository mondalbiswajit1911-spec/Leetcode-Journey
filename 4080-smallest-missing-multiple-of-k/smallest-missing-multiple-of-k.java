class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int mul = k;
        //int res = 0;

        while(set.contains(mul)){
            mul = mul+k;
        }
        return mul;
    }
}