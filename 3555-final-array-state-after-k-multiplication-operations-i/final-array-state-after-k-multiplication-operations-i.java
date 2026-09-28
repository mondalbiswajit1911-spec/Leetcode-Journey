class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->{
            if(a[0] != b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });
        for(int i =0;i<nums.length;i++){
            pq.add(new int[]{
                nums[i],
                i
            });

        }
        for(int j = 0;j<k;j++){
            int[] ele = pq.remove();
            int val = ele[0],
            idx = ele[1];
            int valtoadd  = val * multiplier;

            pq.add(new int[]{
                valtoadd,
                idx
            });
            nums[idx] =valtoadd;
        }
        return nums;




        // for (int i = 0; i < k; i++) {

        //     int min = nums[0];
        //     int minIdx = 0;
        //     for (int j = 1; j < nums.length; j++) {
        //         if (nums[j] < min) {
        //             min = nums[j];
        //             minIdx = j;
        //         }
        //     }
        //     nums[minIdx] = nums[minIdx] * multiplier;
        // }

        // return nums;
    }
}