class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        pq.add(entry.getValue());
        }
        
        while(!pq.isEmpty()){
            int freq = pq.remove();
            k = k-freq;
            if(k<0){
                pq.add(freq);
                break;
            }
        }
        return pq.size();
    }
}