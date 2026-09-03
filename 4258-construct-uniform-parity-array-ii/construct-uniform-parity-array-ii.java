class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int num:nums1){
            if(num %2==0){
                minEven = Math.min(minEven,num);
            }else{
                minOdd = Math.min(minOdd, num);
            }
        }
        if(minOdd == Integer.MAX_VALUE){
            return true;
        }
        return minOdd < minEven;

    }
    //     if(canMake(nums1,0)){
    //         return true;
    //     }

    //     if(canMake(nums1,1)){
    //         return true;
    //     }
    //     return false;
    // }
    // private boolean canMake(int[] nums, int tergetParity){
    //     for(int i = 0;i<nums.length;i++){
    //         if(nums[i]%2==tergetParity){
    //             continue;
    //         }
    //         boolean possible = false;

    //         for(int j=0;j<nums.length;j++){
    //             if(i==j){
    //                 continue;
    //             }
    //             int val = nums[i]-nums[j];
    //             if(val >= 1 && val %2==tergetParity){
    //                 possible = true;
    //                 break;
    //             }
    //         }
    //         if(!possible){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}