class Solution {
    public int maximumProduct(int[] nums, int k) {
        long modulo = 1000000007;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.add(num);
        }
        for(int i = 0;i<k;i++){
            int val = pq.remove();
            pq.add(val+1);
        }
        long ans = 1;
        while(!pq.isEmpty()){
            ans = (ans * pq.remove()) % modulo;
        }
        return (int)ans;
    }
}