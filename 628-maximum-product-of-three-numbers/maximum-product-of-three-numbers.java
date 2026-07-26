class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
    //    int productmax =0;
    //     for(int i = 0; i<nums.length;i++){
    //         for(int j =i+1;j<nums.length;j++){
    //             for(int k =j+1;k<nums.length;k++){
    //                 productmax = Math.max(productmax,nums[i] * nums[j] * nums[k]);
    //             }
    //         }
    //     }
    //     return productmax;
    int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}