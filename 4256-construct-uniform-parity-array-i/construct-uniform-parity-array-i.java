class Solution {
    public boolean uniformArray(int[] nums1) {
        // int[] nums2 = new int[nums1.length];
        // nums2 = nums1.clone();
        // if(nums1.length == 1 && nums1[0]%2==0){
        //     return true;
        // }
        // else if(nums1.length == 1 && nums1[0]%2!=0){
        //     return false;
        // }

        // for(int i = 0; i< nums1.length-1;i++){
        //     nums2[i] = nums1[i]-nums2[i+1];
        //     return true;
        // }
        // return false;
        boolean isEven = false;
        boolean isOdd = false;

        for(int num: nums1){
            if(num%2==0){
                isEven = true;
            }
            else{
                isOdd = true;
            }
        }

        if(isEven && !isOdd) return true;
        if(!isEven && isOdd) return true;

        return true;
    }
}