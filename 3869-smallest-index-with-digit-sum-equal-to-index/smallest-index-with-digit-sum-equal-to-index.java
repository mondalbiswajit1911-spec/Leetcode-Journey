class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            int n = nums[i];
            while(n!=0){
                int last = n%10;
                sum  = sum +last;
                n = n/10;
                //return sum;
            }
            //return sum;
            if(sum == i){
                return sum;
            }
        }
        return -1;
    }
}