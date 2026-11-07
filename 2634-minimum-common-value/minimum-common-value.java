class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } 
            else if (nums1[i] < nums2[j]) {
                i++;
            } 
            else {
                j++;
            }
        }

        return -1;
        // Set<Integer> numbers1 = new HashSet<>();
        // Set<Integer> numbers2 = new HashSet<>();
        // for(int num : nums1){
        //     numbers1.add(num);
        // }
        // for(int num : nums2){
        //     numbers2.add(num);
        // }
        // Set<Integer> duplicates = new HashSet<>(numbers1);
        // duplicates.retainAll(numbers2);

        // int min = Collections.min(duplicates);
        // return min;


        // List<Integer> numbers = new ArrayList<>();
        // for(int i = 0; i< nums1.length;i++){
        //     for(int j = 0; j< nums2.length;j++){
        //         if(nums1[i] == nums2[j]){
        //             numbers.add(nums1[i]);
        //         }
        //     }
        // }
        // //int min = 0;
        // int min = Collections.min(numbers);
        // return min;
    }
}