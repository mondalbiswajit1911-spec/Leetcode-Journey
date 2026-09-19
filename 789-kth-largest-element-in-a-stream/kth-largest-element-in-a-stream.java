class KthLargest {
    List<Integer> list;
    int kth;

    public KthLargest(int k, int[] nums) {
        list  =new ArrayList<Integer>();
        kth = k;

        for(int num : nums){
            list.add(num);
        }
        
    }
    
    public int add(int val) {

        list.add(val);
        Collections.sort(list);
        
        return list.get(list.size()-kth);
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */