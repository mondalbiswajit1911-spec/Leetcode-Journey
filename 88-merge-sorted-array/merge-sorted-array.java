class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        int[] res = new int[len];

        for(int i = 0; i< nums1.length;i++){
            res[i] = nums1[i];
        }
        for(int i=0; i< nums2.length;i++){
            res[m+i] = nums2[i];
        }
        Arrays.sort(res);
        for(int i=0;i < m+n;i++){
            nums1[i] = res[i];
        }

        //return nums1;
    }
}