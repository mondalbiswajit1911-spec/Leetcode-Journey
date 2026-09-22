class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> minheap =new PriorityQueue<>((a, b)-> a[0]- b[0]);

        for(int i=0;i<k;i++){
            minheap.add(new int[]{
                nums[i],
                i
            });
        }
        for(int i =k;i<nums.length;i++){
            if(nums[i] > minheap.peek()[0]){
                minheap.remove();
                minheap.add(new int[]{
                    nums[i],
                    i
                });
            }            
        }

        int[][] temp = new int[k][2];
        int j = 0;
        while(j<k){
            int[] ele = minheap.remove();
            temp[j] = ele;
            j++;
        }
        Arrays.sort(temp, (a,b)-> a[1]-b[1]);

        int[] res = new int[k];
        for(int i = 0;i<k;i++){
            res[i] = temp[i][0];
        }
        return res;
    }
}