class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
           freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int num = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int count = entry.getValue();
            if(count > (nums.length/2)){
                num = entry.getKey();
            }
        }
        return num;
    }
}