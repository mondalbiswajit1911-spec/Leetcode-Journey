class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [][] numsDet = new int[nums.length][2];

        for(int i = 0;i <nums.length;i++){
            numsDet[i][0] = nums[i];
            numsDet[i][1] =i;
        }
        Arrays.sort(numsDet, (a, b) -> b[0]-a[0]);


        Arrays.sort(numsDet, 0, k, (a, b)-> a[1] -b[1]);

        int[] res = new int[k];
        for(int i= 0; i< k;i++){
            res[i] = numsDet[i][0];
        }
        return res;
    }
}