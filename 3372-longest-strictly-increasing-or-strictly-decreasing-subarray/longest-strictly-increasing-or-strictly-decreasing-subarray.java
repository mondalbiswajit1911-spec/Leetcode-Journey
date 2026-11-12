class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        //Arrays.sort(nums);
         int strictly_inc = 1,
          strictly_dec = 1;
          int len = 1;
          if(nums.length==1){
            return 1;
          }
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                 strictly_inc++;
                 strictly_dec = 1;
            }else if(nums[i]<nums[i+1]){
                 strictly_dec++;
                 strictly_inc = 1;
            }else{
                 strictly_inc = 1;
                  strictly_dec = 1;
            }
            len = Math.max( len, Math.max(strictly_inc,  strictly_dec));
        }
        return len;

    }
}