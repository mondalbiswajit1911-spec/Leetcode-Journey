class KthLargest {
    PriorityQueue<Integer> minheap;
    int kth;

    public KthLargest(int k, int[] nums) {
        kth = k;
        minheap = new PriorityQueue<Integer>();

        for(int i = 0; i<Math.min(nums.length, k);i++){
            minheap.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i] > minheap.peek()){
                minheap.remove();
                minheap.add(nums[i]);
            }
        }
        
    }
    
    public int add(int val) {
        if(minheap.isEmpty()){
            minheap.add(val);
            return minheap.peek();
        }
        if(minheap.size() < kth){
            minheap.add(val);
            return minheap.peek();
        }
        if(val > minheap.peek()){
            minheap.remove();
            minheap.add(val);
        }

        return minheap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */