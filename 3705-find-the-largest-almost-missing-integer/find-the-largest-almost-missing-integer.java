class Solution {
    public int largestInteger(int[] nums, int k) {
        int len = nums.length;
        //CASE 1
        if(k == len){
            int max = -1;
            for(int i =0; i < len; i++){
                max = Math.max(max, nums[i]);
            }
            return max;
        }
        //CASE 2
        if(k ==1){
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<len;i++){
                map.put(nums[i], map.getOrDefault(nums[i],0) +1);
            }
            int max = -1;
            for(int i=0;i<len;i++){
                int c = map.get(nums[i]);
                if(c ==1){
                    max =Math.max(max, nums[i]);
                }
            }
            return max;
        }
        //CASE 3    
        int start = nums[0];
        int end  =nums[len-1];
        if(start == end){
            return -1;
        }
        for(int i =1;i<len-1;i++){
            if(start == nums[i]){
                start =-1;
            }
            if(end == nums[i]){
                end =-1;
            }

        }
        return Math.max(start, end);
    }
}